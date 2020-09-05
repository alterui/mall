package com.lr.pattern.factory.abstractf;

import com.lr.pattern.factory.entity.Keyboard;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/9/5 14:25
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        Keyboard keyboard = cf.createKeyboard();
        Mouse mouse = cf.createMouse();
        mouse.sayHi();
        keyboard.sayHello();

    }
}
