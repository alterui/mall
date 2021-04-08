package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/6 11:15 上午
 */
public class IsAllLowerCase implements ValidationStrategy{


    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
