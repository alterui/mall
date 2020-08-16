package com.lr.concurrent.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author liurui
 * @date 2020/8/16 22:46
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(9);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t国，被灭");
                countDownLatch.countDown();
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("一统天下");

    }
}
