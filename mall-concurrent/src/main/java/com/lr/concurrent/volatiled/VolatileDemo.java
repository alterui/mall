package com.lr.concurrent.volatiled;

/**
 * @author liurui
 * @date 2020/7/13 20:59
 */


public class VolatileDemo {

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        new Thread(() -> {
            System.out.println("当前线程为：" + Thread.currentThread().getName() + ",i的值为：" + myDate.i);
            myDate.setValue();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "AA").start();


        while (myDate.i == 0) {

        }
        System.out.println("当前线程为：" + Thread.currentThread().getName() + ",i的值为：" + myDate.i + ",线程结束...");


    }
}

class MyDate {
    public volatile int i = 0;

    public void setValue() {
        this.i = 50;
    }

}
