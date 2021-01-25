package com.lr.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lr.mall.product.entity.BrandEntity;
import com.lr.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    DataSource dataSource;


    @Autowired
    private StringRedisTemplate redisTemplate;


    @Test
    public void setValueToRedis() {
        ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
        stringStringValueOperations.set("hello", "world" + UUID.randomUUID());

        String hello = stringStringValueOperations.get("hello");
        System.out.println("从redis里面获取的值为" + hello);
    }


    @Test
    void contextLoads() throws SQLException {
        Connection connection1 = dataSource.getConnection();


        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 6L));

        list.forEach(System.out::println);
    }

}
