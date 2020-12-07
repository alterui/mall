package com.lr.jvm.java.chapter05;

/**
 * @author liurui
 * @date 2020/11/20 11:14 上午
 */
//1000000
public class StringTest1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        //160360

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(System.currentTimeMillis() - l);
    }

}
