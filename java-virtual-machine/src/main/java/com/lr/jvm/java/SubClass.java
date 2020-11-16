package com.lr.jvm.java;

/**
 * @author liurui
 * @date 2020/11/13 4:34 下午
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }

    public static String name = "ss";
}
