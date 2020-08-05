package com.lr.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liurui
 * @date 2020/8/5 3:55 下午
 */
public class LockDemo {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        new Thread(LockDemo::testSync, "t1").start();
        new Thread(LockDemo::testSync, "t2").start();
    }

    /**
     * 使用lock加锁，sleep2s.
     */
    public static void testSync() {
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
