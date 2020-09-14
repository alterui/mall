package com.lr.mall.utils;

import java.util.Scanner;

/**
 * @author liurui
 * @date 2020/9/10 3:56 下午
 */
public class Test {
    public static void main(String[] args) {
        get(1, 0);
    }

    public static int get(int a,int b) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int sum = a / b;
                break;
            } catch (Exception e) {
                System.out.println("除数不能为0，重新输入。。。");
                 b = scanner.nextInt();

            }


        }
        return a/b;
    }
}
