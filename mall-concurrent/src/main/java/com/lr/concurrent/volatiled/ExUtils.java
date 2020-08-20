package com.lr.concurrent.volatiled;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liurui
 * @date 2020/8/18 4:13 下午
 */
public class ExUtils {
    public static ExecutorService getThreadPools() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        return executorService;
    }
}
