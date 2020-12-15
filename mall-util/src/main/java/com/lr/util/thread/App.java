package com.lr.util.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liurui
 * @date 2020/12/8 9:42 上午
 */
public class App {
    public static ExecutorService executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("开始执行。。。");
        executor.submit(()->{
            System.out.println(1);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("222");
        });

        executor.submit(()->{
            System.out.println(2);
        });
        System.out.println("执行结束。。。");



    }
}
