package com.lr.jvm.java.chapter03;

import com.sun.tools.classfile.ConstantPool;

/**
 * @author liurui
 * @date 2020/11/16 2:30 下午
 */
public class StackOverTest {

    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }

}
