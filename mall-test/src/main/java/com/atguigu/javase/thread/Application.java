package com.atguigu.javase.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author liurui
 * @date 2020/9/10 20:15
 */
public class Application {
    static StringBuilder sb = new StringBuilder(1005);
    public static void main(String[] args) {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            throw new RuntimeException("");
        }

        System.out.println("qqqq");
    }


}
