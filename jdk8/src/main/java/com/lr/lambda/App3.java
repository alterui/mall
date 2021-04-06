package com.lr.lambda;

import org.junit.Test;

/**
 * @author liurui
 * @date 2021/4/6 22:12
 */
public class App3 {


    /**
     *  Optional使用：
     *  1. Optional.of(T t):创建一个Optional实例
     *  2. Optional.empty():创建一个空的Optional实例
     *  3. Optional.ofNullable(T t):若t不为null，创建Optional实例，否则创建空实例
     *  4. isPresent(): 判断是否包含值
     *  5. orElse(T t):如果调用对象包含值，返回该值。否则返回t。
     *  6. orElseGet(Supplier s): 如果调用对象包含值，则返回该值，否则返回s获取的值。
     *  7.map(Function f):如果有值对其处理，并返回处理后的Optional,否则返回Optional.empty()
     *  8.flatMap(Function mapper):与map类似，要求返回值必须是Optional。
     */
    @Test
    public void test() {

    }
}
