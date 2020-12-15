package com.lr.util.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liurui
 * @date 2020/12/7 4:32 下午
 */
public class ThreadPoolTest {
    static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
            5,
            10,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(5),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {
        AtomicInteger sum = new AtomicInteger();
        for (int i = 0; i < 300; i++) {
            int finalI = i;
            threadPoolExecutor.execute(()->{
                System.out.println(finalI);
                sum.getAndIncrement();
            });

        }
        System.out.println("总和："+sum.get());
    }
}
