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



   /* public static void main(String[] args) {
        ReflectClass reflectClass = new ReflectClass();
        System.out.println(reflectClass);
    }*/

    public static void main(String[] args) {
        String str = "ajsjshdnksadhja";
        String[] split = str.split("");

        StringBuilder sb = new StringBuilder();
        Stream.of(split).forEach(e->{
            if ("a".equals(e)) {
                sb.append("b");
            } else {
                sb.append(e);
            }
        });
        System.out.println(sb.toString());

        boolean y = false;
        int z=0;
        if (y == true) {
            if ((z++ == 42) && (y == true)) {

            }
        }
    }





}
