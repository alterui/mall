package com.mall.mallredisson.controller;

import com.mall.mallredisson.model.User;
import io.micrometer.core.instrument.util.StringUtils;
import io.micrometer.core.lang.Nullable;
import org.apache.catalina.core.ApplicationContext;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/10/30 3:40 下午
 */
@RestController
public class  IndexController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/index")
    public String index() {
        RLock lock = redissonClient.getLock("lock");
        /**
         * 1.阻塞式等待:默认加锁的时间是30s
         * 1). 看门狗策略：
         *      锁的自动续期，如果业务超长，运行期间会自动续上30S(在使用（30/3）)之后。因此
         *      不必担心时间长，锁自动过期被删掉。
         *
         * 2). 如果出现服务器崩溃，也会在30之后将锁自动删除掉。
         */
        //lock.lock();


        /**
         * 设置超时时间，超时自动解锁
         */
        lock.lock(10, TimeUnit.SECONDS);
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
