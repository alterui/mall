package com.lr.mall.product.service.impl;

import com.lr.mall.product.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author liurui
 * @date 2020/8/18 22:50
 */
public class RedissionLock {

    @Autowired
    private RedisTemplate redisTemplate;
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
                //categoryEntityList = listWithTreeFromDB();
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
            return null;
        } else {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return listWithTreeFromDBWithRedisLock();
        }

    }
}
