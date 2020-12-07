package com.lr.jvm.java.chapter05;

/**
 * @author liurui
 * @date 2020/11/23 9:41 上午
 */
public class StringNewTest {
    public static void main(String[] args) {

        String s1 = new String("1") + new String("1");
        s1.intern();
        String s2 = "11";
        System.out.println(s1 == s2);
    }
}
