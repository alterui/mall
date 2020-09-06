package com.lr.reflect;

/**
 * @author liurui
 * @date 2020/9/5 15:44
 * 获取class的三种方式
 */

public class ReflectTarget {
    public static void main(String[] args) throws Exception {

        //第一种方式
        Class<?> reflectTargetClass1 = ReflectTarget.class;
        System.out.println("1：" + reflectTargetClass1);

        //第二种方式
        ReflectTarget reflectTarget = new ReflectTarget();
        Class<?> reflectTargetClass2 = reflectTarget.getClass();
        System.out.println("2：" + reflectTargetClass2);
        System.out.println(reflectTargetClass1 == reflectTargetClass2);

        //第三种方式
        Class<?> reflectTargetClass3 = Class.forName("com.lr.reflect.ReflectTarget");
        System.out.println("3：" + reflectTargetClass3);
        System.out.println(reflectTargetClass2 == reflectTargetClass3);

    }

}
