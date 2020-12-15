package com.lr.util.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author liurui
 * @date 2020/12/6 22:07
 */
public class CompletableFutureTest {
    public static Executor executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws Exception {
        System.out.println("当前线程：" + Thread.currentThread().getId()+"，开始执行");
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {

            System.out.println("当前线程：" + Thread.currentThread().getId());
            int i = 10 / 2;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getId()+"执行结束");
            return i;
        }, executor);


        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程：" + Thread.currentThread().getId()+"，开始执行");
            int i = 10 / 5;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getId()+"执行结束");
            return i;
        }, executor);

        CompletableFuture<Object> objectCompletableFuture = CompletableFuture.anyOf(future1, future2);
        objectCompletableFuture.get();
        System.out.println("主线程结束...");




    }
}
