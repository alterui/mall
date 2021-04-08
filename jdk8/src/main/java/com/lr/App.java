package com.lr;

/**
 * @author liurui
 * @date 2021/4/7 5:21 下午
 */
public class App {

    static boolean stop = false;
    public static void main(String[] args)  {

        new Thread(() -> {
            while (!stop) {
            }
            System.out.println("I am done");
        }).start();


        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            System.out.println("线程2执行了");
            stop = true;
        }).start();


    }
}
