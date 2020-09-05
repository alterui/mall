package com.lr.pattern.factory.abstractf;

import com.lr.pattern.factory.entity.Keyboard;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/9/5 14:23
 * 抽象工厂模式：
 *    添加新的接口功能时，依然不符合开闭原则，之前实现接口的所有实现类都需要改动。
 */
public interface ComputerFactory {
    Mouse createMouse();
    Keyboard createKeyboard();

}
