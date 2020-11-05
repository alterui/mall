package com.mall.mallredisson.controller;

import com.mall.mallredisson.model.User;
import io.micrometer.core.instrument.util.StringUtils;
import io.micrometer.core.lang.Nullable;
import org.apache.catalina.core.ApplicationContext;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Semaphore;
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

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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

    /**
     * 读写锁
     * 读写，写读，写写都是会加锁等待的，
     * 只有读读不会等待。
     *
     * 使用场景：读多写少的场景
     *
     * @return
     */
    @GetMapping("/writer")
    public String writer() {

        RReadWriteLock readWriteLock = redissonClient.getReadWriteLock("wd-lock");
        RLock rLock = readWriteLock.writeLock();
        rLock.lock(30, TimeUnit.SECONDS);

        try {
            stringRedisTemplate.opsForValue().set("writerValue", UUID.randomUUID().toString());
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            rLock.unlock();
        }

        return "writer";

    }

    @GetMapping("/reader")
    public String reader() {

        RReadWriteLock readWriteLock = redissonClient.getReadWriteLock("wd-lock");
        RLock rLock = readWriteLock.readLock();
        rLock.lock(30, TimeUnit.SECONDS);
        String writerValue = "";
        try {
            writerValue  = stringRedisTemplate.opsForValue().get("writerValue");
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            rLock.unlock();
        }

        return writerValue;

    }

    /**
     * 车库停车
     * 3车位
     *
     * @return
     */
    @GetMapping("/park")
    public String park() {
        //这个相当于在redis get park，因此我们要事先在redis里面set value。
        RSemaphore park = redissonClient.getSemaphore("park");
        // park.acquire();//这个会堵塞式获取，直到有别人释放
        /**
         * 尝试获取,没有获取到就返回一个error页面，因此可以做分布式限流
         */
        boolean b = park.tryAcquire();
        if (b) {
            //执行业务
        } else {
            return "error";
        }
        return "ok";
    }

    @GetMapping("/park1")
    public String park1() {
        /**
         * Semaphore是一种基于技术的信号量，它可以设定一个阈值，低于阈值可以执行，高于阈值则需要等待。
         */
        Semaphore semaphore = new Semaphore(0);
        semaphore.tryAcquire();
        return "ok";
    }

    /**
     * 放假，锁门
     * 只有所有的人都走完了，才能锁门
     */
    @GetMapping("/lockDoor")
    public String lockDoor() {
        RCountDownLatch door = redissonClient.getCountDownLatch("door");
        door.trySetCount(5);
        try {
            door.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "放假了";
    }

    @GetMapping("/gogo/{id}")
    public String gogogo(@PathVariable("id") Long id) {
        RCountDownLatch door = redissonClient.getCountDownLatch("door");
        door.countDown();
        return id + "班级的走了";
    }




}
