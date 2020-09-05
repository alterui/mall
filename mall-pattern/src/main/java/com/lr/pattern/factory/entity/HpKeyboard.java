package com.lr.pattern.factory.entity;

import java.security.Key;

/**
 * @author liurui
 * @date 2020/9/5 14:17
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是惠普键盘");
    }
}
