package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/7 11:54 上午
 */
public class App {
    public static void main(String[] args) {
        Validator validator = new Validator(new IsNumeric());
        System.out.println(validator.validate("aaa"));
    }
}
