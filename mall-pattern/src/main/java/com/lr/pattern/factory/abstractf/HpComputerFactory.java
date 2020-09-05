package com.lr.pattern.factory.abstractf;

import com.lr.pattern.factory.entity.HpKeyboard;
import com.lr.pattern.factory.entity.HpMouse;
import com.lr.pattern.factory.entity.Keyboard;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/9/5 14:24
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }

}
