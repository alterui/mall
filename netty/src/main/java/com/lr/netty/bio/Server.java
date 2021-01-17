package com.lr.netty.bio;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liurui
 * @date 2021/1/17 15:53
 */
public class Server {
    public static void main(String[] args) throws Exception {

        byte[] bytes = new byte[1024];
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            //堵塞
            System.out.println("等待连接...");
            Socket accept = serverSocket.accept();
            System.out.println("连接成功...");
            //当client传过来值的时候，就会执行下面的
            //读取消息，输入输出是针对CPU而言的。
            //因为需要去取消息，所以要读取到cpu
            System.out.println("等待读取数据...");
            accept.getInputStream().read(bytes);
            System.out.println("读取的数据为："+new String(bytes));
        }

    }
}
