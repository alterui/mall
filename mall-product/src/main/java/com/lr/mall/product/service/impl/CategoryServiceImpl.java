package com.lr.mall.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lr.common.utils.PageUtils;
import com.lr.common.utils.Query;

import com.lr.mall.product.dao.CategoryDao;
import com.lr.mall.product.entity.CategoryEntity;
import com.lr.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );



        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        String category = redisTemplate.opsForValue().get("category");
        if (StringUtils.isNotBlank(category)) {
            return JSON.parseObject(category, new TypeReference<List<CategoryEntity>>() {
            });
        }
        List<CategoryEntity> categoryEntityList = listWithTreeFromDB();
        redisTemplate.opsForValue().set("category", JSON.toJSONString(categoryEntityList));
        return categoryEntityList;
    }

    /**
     * 注意点：
     *    1.设置key的过期时间必须和加锁是同步的
     *    2.
     *
     * @return
     */
    public List<CategoryEntity> listWithTreeFromDBWithRedisLock() {
        /**
         * 1. set key value EX 300 NX (只有这个key不存在的时候，才设置key的有效期为300s)
         */
        String uuid = UUID.randomUUID().toString();
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("lock", uuid, 300, TimeUnit.MINUTES);

        if (lock!=null && lock) {
            List<CategoryEntity> categoryEntityList;
            try {
                categoryEntityList = listWithTreeFromDB();
            } finally {
                /**
                 * 2.这样删除不能够保证原子删除操作。
                 *  1）校验uuid和redis里面的相等的时候，开始进行删除操作。
                 *  这个时候被堵塞，下次执行删除操作的时候，由于redis 的key 超时自动删除。
                 *  这个时候新的请求已经进来了，而这个时候再执行del操作，就会把新的锁给删除掉。
                 */
               /* if (Objects.equals(uuid, redisTemplate.opsForValue().get("lock"))) {
                    redisTemplate.delete("lock");
                }*/
                /**原子操作，使用lua脚本进行删除锁。
                 *
                 */
                String script = "if redis.call(\"get\",KEYS[1]) == ARGV[1] then return redis.call(\"del\",KEYS[1]) else return 0 end";
                redisTemplate.execute(new DefaultRedisScript<Long>(script, Long.class), Collections.singletonList("lock"), uuid);
            }
            return categoryEntityList;
        } else {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return listWithTreeFromDBWithRedisLock();
        }

    }


    public List<CategoryEntity> listWithTreeFromDB() {

        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        return categoryEntityList.stream()
                .filter(e -> Objects.equals(e.getParentCid(), 0L))
                .peek(e -> e.setChild(getCategoryAndChild(e, categoryEntityList)))
                .sorted(Comparator.comparingInt(k -> (k.getSort() == null ? 0 : k.getSort())))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getCategoryAndChild(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(e -> Objects.equals(root.getCatId(), e.getParentCid()))
                .peek(e -> e.setChild(getCategoryAndChild(e, all)))
                .sorted(Comparator.comparingInt((e -> e.getSort() == null ? 0 : e.getSort())))
                .collect(Collectors.toList());
    }


}