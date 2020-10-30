package com.lr.spring.service;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/8/28 6:14 下午
 */

public  class Animal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());

    }


}

