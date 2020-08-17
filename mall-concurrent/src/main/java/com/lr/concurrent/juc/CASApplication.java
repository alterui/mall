package com.lr.concurrent.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liurui
 * @date 2020/8/17 9:55 上午
 */
public class CASApplication {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.compareAndSet(0, 9);
        System.out.println(atomicInteger.get());

    }
}
