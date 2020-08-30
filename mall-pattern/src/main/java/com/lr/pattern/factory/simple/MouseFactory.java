package com.lr.pattern.factory.simple;

import com.lr.pattern.factory.entity.DellMouse;
import com.lr.pattern.factory.entity.HpMouse;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/8/30 10:02
 */
public class MouseFactory {
    public static Mouse createMouse(Integer type) {
        switch (type) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return new DellMouse();
        }

    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(9 );
        mouse.sayHi();
    }
}
