package com.lr.jvm.java.chapter02;

/**
 * @author liurui
 * @date 2020/11/16 10:12 上午
 */
public class ClassInitTest {
    private static int numbner = 10;
    private static int num = 1;
    static {
        num = 2;
        numbner = 20;
        System.out.println(num);
        System.out.println(numbner);

    }

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.numbner);
    }
}

