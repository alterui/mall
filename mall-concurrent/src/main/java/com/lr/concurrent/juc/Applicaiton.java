package com.lr.concurrent.juc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @author liurui
 * @date 2020/8/16 22:59
 */
public class Applicaiton {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(8);

        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        list.parallelStream().forEach(e->{
            list.add(e);
            System.out.println(e);
            countDownLatch.countDown();
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("结束");

    }
}
