package com.lr.pattern.factory.simple;

import com.lr.pattern.factory.entity.DellMouse;
import com.lr.pattern.factory.entity.HpMouse;
import com.lr.pattern.factory.entity.Mouse;

/**
 * 简单工厂模式
 * 通过传参到工厂，实现某一个类。
 * 适用场景：
 *  需要创建的对象少
 *  客户端无需关心对象的创建过程
 *  开闭原则：
 *      应该对拓展开放，对修改关闭。
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
        Mouse mouse = MouseFactory.createMouse(0 );
        mouse.sayHi();
    }
}
