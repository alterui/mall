package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/6 11:27 上午
 */
public class IsNumeric implements ValidationStrategy {

    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
