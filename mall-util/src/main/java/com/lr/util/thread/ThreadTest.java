package com.lr.util.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author liurui
 * @date 2020/12/3 22:43
 */
public class ThreadTest {

    public static ExecutorService service = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws Exception{
        /**
         * 使用线程池的submit()方法，根据return的返回类型，返回值Future会得到相同的类型
         */
        Future<Integer> submit = service.submit(() -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            int i = 10 / 2;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("运行结果：" + i);
            return i;

        });
        System.out.println(submit.get());
        System.out.println("主线程运行结束...");
    }

    /**
     * 实现Callable接口，可以携带返回值
     */
    public static class Thread03 implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            int i = 10 / 2;
            System.out.println("运行结果：" + i);
            return i;
        }
    }


    public static class Thread02 implements Runnable{
        @Override
        public void run() {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            int i = 10 / 2;
            System.out.println("运行结果：" + i);
        }
    }


    /**
     * 继承Thread类，实现run()方法
     */
    public static class Thread01 extends Thread{
        @Override
        public void run() {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            int i = 10 / 2;
            System.out.println("运行结果：" + i);
        }
    }


}
