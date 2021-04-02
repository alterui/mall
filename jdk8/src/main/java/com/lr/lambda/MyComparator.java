package com.lr.lambda;

/**
 * @author liurui
 * @date 2021/3/27 9:59
 */
public interface MyComparator<T> {

    /**
     * 自定义比较器
     * @param t
     * @return
     */
    Boolean comparator(T t);
}
