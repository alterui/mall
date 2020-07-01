package com.lr.mall.thread;

import java.util.*;
public class MainTest {
    Map<String,String> map = new HashMap<>();

    public void hashMapTest() {
        for (int i = 0;i < 50000;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0;j < 500;j++) {
                        map.put(Thread.currentThread().getName() + "-" + j, j+"");
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
//            map.forEach((x,y) -> System.out.println(x));
            System.out.println(map.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MainTest().hashMapTest();
    }
}
