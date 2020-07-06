package com.lr.concurrent.utils;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author liurui
 * @date 2020/7/6 2:40 下午
 */
public class Application {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final AtomicInteger count = new AtomicInteger(5);
        for (int i = 0; i < 2; i++) {
            Thread.sleep(20);

            Thread thread = new Thread(()->{
                count.compareAndSet(5, 10);
            });
            System.out.println(Thread.currentThread().getName() + ":" + count);
            thread.start();
        }



    }
}
