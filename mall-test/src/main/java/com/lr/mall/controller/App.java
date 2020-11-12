package com.lr.mall.controller;

import com.google.common.collect.Lists;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/11/11 3:14 下午
 */
public class App {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(11, "想"));
        list.add(new Student(3, "剥"));
        list.add(new Student(131, "你"));
        list.add(new Student(121, "在"));
        list.add(new Student(121, "在"));
        list.add(new Student(121, "在"));
        list.add(new Student(121, "在"));
        list.add(new Student(121, "在"));
        list.add(new Student(121, "在"));

        int size = 2;
        List<List<Student>> partition = Lists.partition(list, size);
        System.out.println("总条数："+list.size());
        System.out.println("总页数："+partition.size());
        System.out.println("每页大小："+size);


        //获取第2页的数据
        System.out.println("获取第2页的数据");
        partition.get(1).forEach(System.out::println);
        System.out.println("获取第5页的数据");
        //获取第5页的数据
        partition.get(5-1).forEach(System.out::println);
    }
}
