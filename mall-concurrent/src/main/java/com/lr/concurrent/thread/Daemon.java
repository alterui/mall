package com.lr.concurrent.thread;

/**
 * @author liurui
 * @date 2020/12/11 11:48 上午
 */

public class Daemon {
    public static void main(String[] args) {


      Thread run = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run");
            }

        });
        run.setDaemon(true);
        run.start();
        System.out.println("stop");
    }
}
