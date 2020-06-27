package com.lr.mall.thread;

import java.util.concurrent.*;

/**
 * @author liurui
 * @date 2020/6/27 16:08
 */
public class Application {


    private static final ExecutorService service = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws Exception {

        System.out.println("main...start...");
        /**
         * 1).继承Thread类
         *  Thread01 thread = new Thread01();
         *  thread.start();
         * 2).实现Runnable接口
         *   Runnable01 runnable01 = new Runnable01();
         *   new Thread(runnable01).start();
         * 3).实现Callable接口+Future(可以拿到返回结果，可以处理异常)
         *
         *    FutureTask<Integer> futureTask = new FutureTask<>(new Callable01());
         *    new Thread(futureTask).start();
         *    futureTask.get();
         * 4).线程池
         *
         *   Future<Integer> submit = service.submit(new Callable01());
         *         Integer integer = submit.get();
         *         System.out.println(integer);
         *
         *   service.execute(new Runnable01());
         *
         *
         *    区别：
         *          1、2都不能得到返回值，3是可以得到返回值的，且可以堵塞获取到值。
         *          1、2、3都不能控制资源。
         *          4可以获取资源，性能稳定。
         *
         *
         *
         *
         *
         */


        service.execute(new Runnable01());
        System.out.println("main...end...");
        service.shutdown();
    }

    public static class Thread01 extends Thread {
        @Override
        public void run() {
            System.out.println("当前线程：" + Thread.currentThread().getId());
            int i = 10 / 2;
            System.out.println("运行结果：" + i);
        }
    }

    public static class Runnable01 implements Runnable {
        @Override
        public void run() {
            System.out.println("当前线程：" + Thread.currentThread().getId());
            int i = 10 / 5;
            System.out.println("运行结果：" + i);
        }
    }

    public static class Callable01 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("当前线程：" + Thread.currentThread().getId());
            int i = 10 / 5;
            System.out.println("运行结果：" + i);
            Thread.sleep(3000);

            return i;
        }
    }


}
