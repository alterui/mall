package com.lr.jvm.java.chapter01;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liurui
 * @date 2020/11/12 2:58 下午
 */
public class HelloApp {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])");



            System.out.println(compile.matcher("0").matches());


    }
}
