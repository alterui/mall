package com.mall.mallredisson;

import jodd.template.StringTemplateParser;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class MallRedissonApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @Test
    void contextLoads() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("liu", "rui");

        String liu = ops.get("liu");
        System.out.println(liu );

    }

}
