package com.lr.pattern.factory.entity;

/**
 * @author liurui
 * @date 2020/9/5 14:18
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("这是戴尔键盘");
    }
}
