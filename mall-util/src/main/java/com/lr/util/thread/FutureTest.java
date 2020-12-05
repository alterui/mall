package com.lr.util.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author liurui
 * @date 2020/12/3 20:53
 */
public class FutureTest {
    private static final ExecutorService executor = Executors.newFixedThreadPool(8);

    public static void main(String[] args) throws Exception {
        Future<List<Integer>> future = executor.submit(() -> {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                System.out.println("线程任务开始");
                Thread.sleep(2300);
                list.add(i);
            }
            return list;
        });

        System.out.println("aaa");

        List<Integer> list = future.get();

        list.forEach(System.out::println);


        System.out.println("end");

        executor.submit(() -> {

            System.out.println("线程2任务开始");

        });


    }
}
