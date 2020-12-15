package com.lr.netty.bio;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liurui
 * @date 2020/12/9 2:35 下午
 */
public class BIOServer {
    static final ExecutorService service = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务器端启动了.....");

        while (true) {
            System.out.println("线程id:" + Thread.currentThread().getId() + ",线程名称：" + Thread.currentThread().getName());
            //监听等待客户端的链接
            System.out.println("等待连接...");
            Socket accept = serverSocket.accept();
            System.out.println("连接到一个客户端.....");
            service.execute(()-> handle(accept));

        }
    }

    public static void handle(Socket socket) {
        System.out.println("接收信息，线程id:" + Thread.currentThread().getId() + ",线程名称：" + Thread.currentThread().getName());

        byte[] bytes = new byte[1024];
        try {
            InputStream inputStream = socket.getInputStream();
            //循环读取客户端发送的信息
            while (true) {
                System.out.println("接收信息，线程id:" + Thread.currentThread().getId() + ",线程名称：" + Thread.currentThread().getName());
                System.out.println("read...");
                int read = inputStream.read(bytes);
                if (read != -1) {
                    //输出客户端发送的数据
                    System.out.print(new String(bytes, 0, read));
                }else {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
