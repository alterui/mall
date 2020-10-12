package com.lr.pattern.bean;

import com.alibaba.fastjson.JSON;
import jdk.nashorn.internal.ir.IdentNode;
import lombok.Data;

import java.util.*;

/**
 * @author liurui
 * @date 2020/6/8 4:32 下午
 */

public class Man {
    private Integer age;
    private int name;



    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }



    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add("AA".hashCode());
        set.add("AA".hashCode());
        set.add("CC".hashCode());
        set.forEach(System.out::println);

        Object o = new Object();
        o.hashCode();
    }

}
