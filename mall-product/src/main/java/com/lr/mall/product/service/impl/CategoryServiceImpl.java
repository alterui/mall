package com.lr.mall.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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