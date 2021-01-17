package com.lr.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟NIO
 * @author liurui
 * @date 2021/1/17 15:53
 */
public class ThreadServer {
    public static void main(String[] args) throws Exception {

        byte[] bytes = new byte[1024];
        ServerSocket serverSocket = new ServerSocket(8081);
        while (true) {
            //堵塞
            System.out.println("等待连接...");
            Socket accept = serverSocket.accept();
            System.out.println("连接成功...");
            //当client传过来值的时候，就会执行下面的
            //读取消息，输入输出是针对CPU而言的。
            //因为需要去取消息，所以要读取到cpu
            new Thread(()->{
                //循环读
                while (true) {
                    System.out.println("等待读取数据...,线程："+Thread.currentThread());
                    try {
                        accept.getInputStream().read(bytes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("读取的数据为："+new String(bytes));

                }

            }).start();
        }

    }
}
