package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/7 2:23 下午
 */
public class Application {
    public static void main(String[] args) {
        Validator validator = new Validator(s->s.matches("[a-z]+"));
        boolean b1 = validator.validate("aaaa");
        System.out.println(b1);
    }
}
