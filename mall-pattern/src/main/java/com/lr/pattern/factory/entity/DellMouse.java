package com.lr.pattern.factory.entity;

/**
 * @author liurui
 * @date 2020/8/30 10:00
 */
public class DellMouse implements Mouse {
   public   DellMouse() {

    }

    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }

     void get() {

    }

    public static void main(String[] args) {
        new DellMouse().get();
    }
}
