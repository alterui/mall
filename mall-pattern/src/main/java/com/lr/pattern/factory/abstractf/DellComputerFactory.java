package com.lr.pattern.factory.abstractf;

import com.lr.pattern.factory.entity.DellKeyboard;
import com.lr.pattern.factory.entity.DellMouse;
import com.lr.pattern.factory.entity.Keyboard;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/9/5 14:23
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
