package com.lr.jvm.java;

/**
 * @author liurui
 * @date 2020/11/13 4:34 下午
 */

public class NotInitialization {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
