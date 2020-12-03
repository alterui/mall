package com.work;

import com.alibaba.fastjson.JSON;

import java.net.http.HttpClient;


import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/11/29 18:11
 */
public class App {
    private static int num = 1;
    static {
        num = 2;
        number = 20;

        System.out.println(num);
        //报错，非法的前向引用

    }

    private static int number = 10;


    public static void main(String[] args) {
       // 10

    }
}
