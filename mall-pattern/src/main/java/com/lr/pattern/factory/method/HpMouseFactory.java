package com.lr.pattern.factory.method;

import com.lr.pattern.factory.entity.HpMouse;
import com.lr.pattern.factory.entity.Mouse;

/**
 * @author liurui
 * @date 2020/8/31 3:44 下午
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }


}
