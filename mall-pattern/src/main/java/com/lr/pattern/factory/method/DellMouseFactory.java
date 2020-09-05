package com.lr.pattern.factory.method;

import com.lr.pattern.factory.entity.DellMouse;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/8/31 3:45 下午
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
