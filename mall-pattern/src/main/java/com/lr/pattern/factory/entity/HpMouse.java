package com.lr.pattern.factory.entity;

/**
 * @author liurui
 * @date 2020/8/30 10:01
 */
public class HpMouse implements Mouse {

    @Override
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }

    public static void main(String[] args) {
        new DellMouse().get();
    }
}
