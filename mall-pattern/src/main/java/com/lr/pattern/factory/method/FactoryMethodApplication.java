package com.lr.pattern.factory.method;

import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/9/1 20:16
 */
public class FactoryMethodApplication {
    public static void main(String[] args) {
        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse mouse = hpMouseFactory.createMouse();
        mouse.sayHi();
    }
}
