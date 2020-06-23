package com.lr.mall.test.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.lr.mall.test.CommonException;
import com.lr.mall.test.bean.SmsSenderFormVO;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/6/3 3:11 下午
 */
public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        List<List<Integer>> partition = Lists.partition(list, 2);


        List<Integer> collect = partition.stream().flatMap(Collection::stream).collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
