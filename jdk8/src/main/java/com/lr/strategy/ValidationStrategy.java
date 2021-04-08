package com.lr.strategy;

/**
 * @author liurui
 * @date 2021/4/6 11:07 上午
 */

@FunctionalInterface
public interface ValidationStrategy {
    boolean execute(String s);
}
