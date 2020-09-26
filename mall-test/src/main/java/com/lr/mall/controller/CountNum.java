package com.lr.mall.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/9/20 19:48
 */
@Component
public class CountNum {

    public void getWords() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() );
        }
    }


}

