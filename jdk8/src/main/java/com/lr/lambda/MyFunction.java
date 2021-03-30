package com.lr.lambda;

/**
 * @author liurui
 * @date 2021/3/27 14:53
 */
@FunctionalInterface
public interface MyFunction<T> {
    Integer getValue(T t);


}
