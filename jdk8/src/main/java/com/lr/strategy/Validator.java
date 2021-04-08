package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/6 11:28 上午
 */
public class Validator {
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }

}
