package com.mall.mallredisson.controller;

import com.mall.mallredisson.model.User;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/10/30 3:40 下午
 */
@RestController
public class IndexController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/index")
    public String index() {
        RLock lock = redissonClient.getLock("lock");
        lock.lock();

        try {
            System.out.println("加锁成功，执行任务..." + Thread.currentThread().getId());
            Thread.sleep(50000);
        } catch (Exception ignored) {

        }finally {
            System.out.println("释放锁..." + Thread.currentThread().getId());
            lock.unlock();

        }
        return "index";
    }


}
