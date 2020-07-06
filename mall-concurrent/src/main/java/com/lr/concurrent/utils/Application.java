package com.lr.concurrent.utils;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author liurui
 * @date 2020/7/6 2:40 下午
 */
public class Application {

    public static void main(String[] args) throws Exception {

        final AtomicInteger count = new AtomicInteger(5);
        for (int i = 0; i < 2; i++) {


            Thread thread = new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                boolean b = count.compareAndSet(5, 10);
                System.out.println(Thread.currentThread().getName() + ":" + b);
            });
            thread.start();

        }

        Thread thread = new Thread(() -> {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean b = count.compareAndSet(10, 5);
            System.out.println(Thread.currentThread().getName() + ":" + b);
        });
        thread.start();





    }
}
