package com.mall.mallredisson.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author liurui
 * @date 2020/11/2 11:14 上午
 */
public class SemaphoreTest {
    private static final int COUNT = 400;
    private static final Executor executor = Executors.newFixedThreadPool(COUNT);
    private static final Semaphore semaphore = new Semaphore(1);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < COUNT; i++) {
            executor.execute(()->{
                try {
                    System.out.println("开始获取 "+Thread.currentThread().getId());
                    semaphore.acquire();
                    System.out.println("当前线程获取信号量" + Thread.currentThread().getId());
                    Thread.sleep(200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release();
                System.out.println("当前线程释放信号量" + Thread.currentThread().getId());
            });
        }



    }

    public static void sort(String startTime, String endTime) {
        //将startTime到endTime的所有时间放到map里面
        Map<Date, Integer> map = new HashMap<>();
        //然后用查到所有的，根据date分
    }


}
