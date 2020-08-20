package com.lr.concurrent.volatiled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author liurui
 * @date 2020/8/18 4:01 下午
 */
public class Main {
    static ScheduledExecutorService executorService;


    ScheduledExecutorService get() {
        return executorService = Executors.newScheduledThreadPool(20);
    }


    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        for (int i = 0; i < 200; i++) {
            System.out.println(instance.getExecutorService().toString());
        }
    }

}
