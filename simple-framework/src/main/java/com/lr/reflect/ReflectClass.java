package com.lr.reflect;

import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/5 16:11
 */
public class ReflectClass {
    ReflectClass(String str) {
        System.out.println("aa");
    }

    ReflectClass(char str) {
        System.out.println("aa");
    }
   ReflectClass() {
        System.out.println("bbb");
    }



    public static void main(String[] args) {
        ReflectClass reflectClass = new ReflectClass();
        System.out.println(reflectClass);
    }


}
