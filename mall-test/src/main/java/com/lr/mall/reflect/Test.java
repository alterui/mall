package com.lr.mall.reflect;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author liurui
 * @date 2020/7/27 4:16 下午
 */
@ThirdProvider("4")
public class Test extends Person<Student>{
    public static void main(String[] args) {

        Test test = new Test();
        test.get();

    }


    public void get() {

        ThirdProvider annotation = getClass().getAnnotation(ThirdProvider.class);
        System.out.println(annotation.value());
        /* *//* Type type = getClass().getGenericSuperclass();

        Type trueType = ((ParameterizedType)type).getActualTypeArguments()[0];
        System.out.println(trueType);*//*

        Type type = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        Type[] actualTypes = pt.getActualTypeArguments();
        System.out.println(actualTypes[0]);

        Student student = JSON.parseObject("{\"age\":1,\"name\":\"tom\"}", actualTypes[0]);

        System.out.println(student.toString());*/
    }
}
