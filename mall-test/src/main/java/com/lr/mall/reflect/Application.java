package com.lr.mall.reflect;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author liurui
 * @date 2020/8/28 11:46 上午
 */
public class Application extends Person<Student> {
    public void get() {


        /*  Type type = getClass().getGenericSuperclass();

        Type trueType = ((ParameterizedType)type).getActualTypeArguments()[0];
        System.out.println(trueType);
*/
        Type type = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        System.out.println(pt.getTypeName());
        Type[] actualTypes = pt.getActualTypeArguments();
        System.out.println(actualTypes[0]);

        Student student = JSON.parseObject("{\"age\":1,\"name\":\"tom\"}", actualTypes[0]);

        System.out.println(student.toString());
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.get();
    }
}
