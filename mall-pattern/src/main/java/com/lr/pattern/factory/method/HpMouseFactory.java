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

    public static void main(String[] args) {
        String s = new String("d");
        String s2 = "d";
        String s3 = "d";
        System.out.println(s.hashCode());
        System.out.println(s2.equals(s3));
        System.out.println(s==s2);
    }
}
