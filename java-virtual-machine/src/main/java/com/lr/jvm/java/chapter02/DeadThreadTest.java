package com.lr.jvm.java.chapter02;

/**
 * @author liurui
 * @date 2020/11/16 10:20 上午
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t线程1开始");
            new DeadThread();
        }, "t1").start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "\t 线程2开始");
            new DeadThread();
        },"t2").start();
    }


}

class DeadThread{
    static {

        if (true) {
            System.out.println(Thread.currentThread().getName() + "\t 初始化当前类");
            while (true) {

            }

        }
    }

}
