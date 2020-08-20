package com.lr.concurrent.volatiled;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liurui
 * @date 2020/8/18 2:18 下午
 */
public enum Singleton {
    INSTANCE;

    ScheduledExecutorService executorService;

    Singleton(){
        init();
    }
    private void init() {
        executorService= Executors.newScheduledThreadPool(20);
    }
    public void close() {
        synchronized (executorService) {
            if(executorService != null) {
                this.executorService.shutdown();
            }
        }
    }
    public <T> Future<T> startTask(Runnable task, int time) {
        if(executorService == null) {
            synchronized (this) {
                init();
            }
        }
        return (Future<T>) this.executorService.schedule(task,time, TimeUnit.MILLISECONDS);
    }

    ScheduledExecutorService getExecutorService() {
        return executorService;
    }


}
