package com.lr.mall.coupon;

/**
 * @author liurui
 * @date 2020/9/12 23:48
 */
public class Application {
    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(aClass);
    }

}
