package com.lr.mall.utils;

import com.lr.mall.controller.Student;
import org.checkerframework.checker.units.qual.A;

import java.util.*;

/**
 * @author liurui
 * @date 2020/9/10 3:56 下午
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,1));
        list.add(new Student(3,3));
        list.add(new Student(5,5));
        list.add(new Student(7,7));

        Collections.reverse(list);

        list.forEach(System.out::println);

    }
}
