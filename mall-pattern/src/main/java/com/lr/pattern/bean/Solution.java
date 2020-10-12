package com.lr.pattern.bean;

import java.util.regex.Pattern;

/**
 * @author liurui
 * @date 2020/10/9 4:18 下午
 */
public class Solution {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-+]?[\\d]*$");
        for (int i = 0; i < 1000000; i++) {

            System.out.println(pattern.matcher(String.valueOf(i)).matches());
        }
    }
}



