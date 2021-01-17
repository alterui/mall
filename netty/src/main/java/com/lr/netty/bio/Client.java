package com.lr.netty.bio;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author liurui
 * @date 2021/1/17 15:53
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(8081));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();
            System.out.println("发送消息："+next);
            //发送消息
            socket.getOutputStream().write(next.getBytes());

        }
    }
}
