package com.lr.util.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author liurui
 * @date 2020/12/6 22:07
 */
public class CompletableFutureTest {
    public static Executor executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws Exception {
        System.out.println("线程开始执行...");
        CompletableFuture.supplyAsync(() -> {

            System.out.println("当前线程：" + Thread.currentThread().getId());
            int i = 10 / 0;

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        }, executor);
    }
}
