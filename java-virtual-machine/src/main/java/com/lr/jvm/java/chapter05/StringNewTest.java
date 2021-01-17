package com.lr.jvm.java.chapter05;

/**
 * @author liurui
 * @date 2020/11/23 9:41 上午
 */
public class StringNewTest {
    public static void main(String[] args) {

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4); // true
    }
}
