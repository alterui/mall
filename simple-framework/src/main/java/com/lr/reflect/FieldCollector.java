package com.lr.reflect;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/12 19:49
 */
public class FieldCollector {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lr.reflect.ReflectClass");
        System.out.println("============获取公开字段(可以获取父类的公开字段)============");
        Field[] fields = clazz.getFields();
        Stream.of(fields).forEach(System.out::println);
        System.out.println();

        System.out.println("==============获取所有的字段，包括私有的字段====================");
        Field[] declaredFields = clazz.getDeclaredFields();
        Stream.of(declaredFields).forEach(System.out::println);
        System.out.println();

        System.out.println("===================获取公开的某一字段==================");
        Field targetInfo = clazz.getField("targetInfo");
        System.out.println(targetInfo);

        //为该字段赋值
        //1.首先获取该对象
        ReflectClass reflectClass = (ReflectClass) clazz.getConstructor().newInstance();
        targetInfo.set(reflectClass, "待反射一号");
        System.out.println("设置后的字段值为：" + targetInfo);
        System.out.println();

        System.out.println("==================获取所任意的某一个字段================");
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        //为私有字段赋值
        //首先开启暴力设置字段
        name.setAccessible(true);
        name.set(reflectClass, "私有字段赋值");
        System.out.println(reflectClass);
        System.out.println();

    }
}
