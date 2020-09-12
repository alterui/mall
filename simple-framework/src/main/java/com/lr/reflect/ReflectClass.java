package com.lr.reflect;

import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/5 16:11
 */
public class ReflectClass extends ReflectTargetOrigin {
    //(默认)的构造方法
    ReflectClass(String str) {
        System.out.println("(默认)的构造方法str=" + str);
    }
    public  ReflectClass() {
        System.out.println("调用了公有的无参构造方法...");

    }

    //有一个函数的构造方法
    public ReflectClass(char str) {
        System.out.println("调用了带有一个参数的构造法方法，参数值为" + str);
    }

    //有多个参数的构造方法
    public ReflectClass(String name, int index) {
        System.out.println("调用了带有多个参数的构造方法，参数值为" + name + ",序号为：" + index);
    }

    //受保护的构造方法
    protected ReflectClass(boolean n) {
        System.out.println("受保护的构造方法n" + n);
    }

    //私有的构造方法
    private ReflectClass(int index) {
        System.out.println("私有的构造方法，序号：" + index);
    }

    //字段
    private String name;
    protected int index;
    char type;
    public String targetInfo;

    @Override
    public String toString() {
        return "ReflectClass{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", type=" + type +
                ", targetInfo='" + targetInfo + '\'' +
                ", defaultMember='" + defaultMember + '\'' +
                ", publicMember='" + publicMember + '\'' +
                ", protectedMember='" + protectedMember + '\'' +
                '}';
    }

    //成员方法
    public void show1(String str) {
        System.out.println("调用了公有的，参数为String的show1(),str=" + str);
    }

    protected void  show2() {
        System.out.println("调用了受保护的，无参的show2()");
    }

    void show3() {
        System.out.println("调用了默认的，无参的show3()");
    }

    private String show4(int index) {
        System.out.println("调用了私有的，并且有返回值的，int参数的show4,index=" + index);
        return "show for result";
    }


}
