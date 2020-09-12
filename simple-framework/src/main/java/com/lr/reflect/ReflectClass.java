package com.lr.reflect;

import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/5 16:11
 */
public class ReflectClass {
    //(默认)的构造方法
    ReflectClass(String str) {
        System.out.println("(默认)的构造方法str=" + str);
    }
    public  ReflectClass() {
        System.out.println("调用了公有的无参构造方法...");

    }

    //有一个函数的构造方法
    public ReflectClass(char str) {
        System.out.println("调用了带有一个参数的构造法方法，参数值为" + str);
    }

    //有多个参数的构造方法
    public ReflectClass(String name, int index) {
        System.out.println("调用了带有多个参数的构造方法，参数值为" + name + ",序号为：" + index);
    }

    //受保护的构造方法
    protected ReflectClass(boolean n) {
        System.out.println("受保护的构造方法n" + n);
    }

    //私有的构造方法
    private ReflectClass(int index) {
        System.out.println("私有的构造方法，序号：" + index);
    }


}
