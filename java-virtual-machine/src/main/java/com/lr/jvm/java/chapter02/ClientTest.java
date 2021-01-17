package com.lr.jvm.java.chapter02;

/**
 * @author liurui
 * @date 2020/11/16 10:14 上午
 */
public class ClientTest {
    static class Father{
        static {
            A =2;
        }

        public static int A =1 ;
    }

    static class Son extends Father {
        public static int b = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.b);

    }

}
