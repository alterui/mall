package com.lr.util;

import cn.hutool.core.convert.Convert;

/**
 * @author liurui
 * @date 2020/9/14 2:19 下午
 */
public class HuUtils {
    public static void main(String[] args) {
        String str = "3e";
        Integer integer = Convert.toInt(str);
        System.out.println(integer);

    }
}
