package com.lr.mall.reflect;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author liurui
 * @date 2020/7/27 4:36 下午
 */
@AllArgsConstructor
@Data
public class Student {

    private Integer age;
    private String name;

    public static void main(String[] args) {
        Student tom = new Student(1, "tom");
        String otherJson = JSON.toJSONString(tom);
        System.out.println(otherJson);
    }

}
