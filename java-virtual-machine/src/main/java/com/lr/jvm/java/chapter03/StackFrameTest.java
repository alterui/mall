package com.lr.jvm.java.chapter03;

/**
 * @author liurui
 * @date 2020/11/16 2:43 下午
 */
public class StackFrameTest {
    public static void main(String[] args) {
        method01();
    }

    private static int method01() {
        System.out.println("方法1开始");
        int i = method02();
        System.out.println("方法1的结束");
        return i;
    }

    private static int method02() {
        System.out.println("方法2的开始");
        int i = method03();
        System.out.println("方法2的结束");
        return i;
    }

    private static int method03() {
        System.out.println("方法3的开始");
        int i= 30;
        System.out.println("方法3的结束");
        return i;
    }
}
