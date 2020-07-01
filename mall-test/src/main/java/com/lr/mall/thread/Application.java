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
         */

        /**
         * 七大参数：
         *       int corePoolSize：核心线程数;一直存在的(除非设置了allowCoreThreadTimeOut属性)线程池创建完以后就准备就绪的线程数量，等待来接收异步任务执行。
         *       int maximumPoolSize：线程池里面最大的线程数量，控制资源并发的。
         *       long keepAliveTime：存活时间。当前线程数量大于core的数量，并且空闲线程的空闲时间大于指定keepAliveTime，就会释放空闲线程。
         *       TimeUnit unit：存活时间的单位。
         *       BlockingQueue<Runnable> workQueue：阻塞队列。如果任务的数量大于最大线程数，该任务就会先存放在堵塞队列里面，只要有空闲线程，就会从队列里面取出
         *       新的任务去执行。
         *       ThreadFactory threadFactory：线程的创建工厂。
         *       RejectedExecutionHandler handler：如果队列满了，存不了更多的线程任务了，就会触发拒绝策略。
         *
         * 工作顺序：
         *      1.线程池创建，准备好core数量的核心线程，准备接受任务。
         *      2.新的任务进来，用core准备好的空闲线程来执行。
         *           1).如果core满了，就将新进来的任务放到阻塞队列上面，如果线程池没有满，就会创建线程去执行任务;如果线程池满了，就会触发相对应的拒绝策略。
         *      3.除了核心线程数的线程执行完了，如果大于指定的空闲时间，就会释放这些线程。
         *
         *
         *
         * 面试题：一个线程池 core:7,max:20,queue:50,100个并发进来是怎样分配的？
         *    7个会立即执行，50个会进入队列。再开13个线程执行任务，其他线程进行拒绝策略。
         *
         *
         *
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                200,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(100000),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        threadPoolExecutor.execute(new Runnable01());


        int i = threadPoolExecutor.prestartAllCoreThreads();
        System.out.println("num:"+i);


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
