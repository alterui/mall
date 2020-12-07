package com.lr.jvm.java.chapter01;

import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.Objects;

/**
 * @author liurui
 * @date 2020/11/13 11:00 上午
 */
public class User {
    private Integer age;

    public User(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
