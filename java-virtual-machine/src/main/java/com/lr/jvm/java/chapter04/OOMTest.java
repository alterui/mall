package com.lr.jvm.java.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/11/16 6:28 下午
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(true) {


                System.out.println(i++);

            list.add(999999999);
        }
    }
}
