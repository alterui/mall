package com.lr.reflect;

import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/12 22:52
 */
public class MethodCollector {
    public static void main(String[] args) throws Exception {

        //获取Class对象
        Class<?> clazz = Class.forName("com.lr.reflect.ReflectClass");

        //获取所有的公有方法
        System.out.println("=====================获取所有的public方法，包括父类和Object========================");
        Method[] methods = clazz.getMethods();
        Stream.of(methods).forEach(System.out::println);
        System.out.println();
        //获取所有的方法
        System.out.println("======================获取该类的所有的方法============================");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Stream.of(declaredMethods).forEach(System.out::println);
        System.out.println();

        //获取单个公有的方法
        System.out.println("======================获取单个的公有方法==============================");
        Method show1 = clazz.getMethod("show1", String.class);
        System.out.println(show1);
        //需要对象的实例
        ReflectClass reflectClass = (ReflectClass)clazz.getConstructor().newInstance();
        show1.invoke(reflectClass, "带反射方法1号");
        System.out.println();

        //获取一个私有的成员方法
        System.out.println("=======================获取单个的私有的成员方法=======================");
        Method show4 = clazz.getDeclaredMethod("show4", int.class);
        show4.setAccessible(true);
        String result = (String) show4.invoke(reflectClass, 3);
        System.out.println("方法返回值为：" + result);
        System.out.println();
    }
}
