package com.lr.reflect;

import java.lang.reflect.Constructor;
import java.util.stream.Stream;

/**
 * 使用反射获取构造方法
 *
 * @author liurui
 * @date 2020/9/12 14:11
 */

public class ConstructorCollector {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lr.reflect.ReflectClass");
        System.out.println("==========================获取公有的构造方法======================");
        Constructor<?>[] constructors = clazz.getConstructors();
        Stream.of(constructors).forEach(System.out::println);
        System.out.println();

        System.out.println("==========================获取所有的构造方法======================");
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        Stream.of(declaredConstructors).forEach(System.out::println);
        System.out.println();

        System.out.println("==========================获取公有的带有两个参数的构造方法=================");
        Constructor<?> constructor = clazz.getConstructor(char.class);
        System.out.println("constructor=" + constructor);
        System.out.println();

        System.out.println("=========================获取私有的构造方法================================");
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(int.class);
        System.out.println("declaredConstructor=" + declaredConstructor);
        System.out.println();

        //创建实例
        System.out.println("=============获取实例=================");
        //由于构造方法的修饰符是private的，因此需要暴力访问(即忽略访问修饰符)
        declaredConstructor.setAccessible(true);

        ReflectClass reflectClass = (ReflectClass) declaredConstructor.newInstance(1);

        System.out.println(reflectClass);
    }

}
