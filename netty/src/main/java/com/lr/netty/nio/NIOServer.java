package com.lr.netty.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2021/1/17 17:19
 */
public class NIOServer {
    public static void main(String[] args) {
        List<SocketChannel> list = new ArrayList<>();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            ssc.bind(new InetSocketAddress(9091));
            ssc.configureBlocking(false);
            while (true) {
                SocketChannel socketChannel = ssc.accept();
                if (socketChannel == null) {
                    Thread.sleep(1000);
                    System.out.println("没人连接");
                    for (SocketChannel channel : list) {
                        int k = channel.read(byteBuffer);
                        System.out.println(k);
                        if (k != 0) {
                            byteBuffer.flip();
                            System.out.println(new String(byteBuffer.array()));
                        }
                    }
                } else {
                    socketChannel.configureBlocking(false);

                    list.add(socketChannel);
                    //得到套接字，循环所有的套接字，通过套接字获取数据
                    for (SocketChannel channel : list) {
                        int k = channel.read(byteBuffer);
                        System.out.println(k + "=======================================");
                        if (k != 0) {
                            byteBuffer.flip();
                            System.out.println(new String(byteBuffer.array()));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
