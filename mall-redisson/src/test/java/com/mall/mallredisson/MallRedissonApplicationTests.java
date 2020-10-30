package com.mall.mallredisson;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallRedissonApplicationTests {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    void contextLoads() {
        System.out.println(redissonClient);
    }

}
