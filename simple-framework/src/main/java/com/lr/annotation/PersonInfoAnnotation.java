package com.lr.annotation;

import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liurui
 * @date 2020/9/13 16:27
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface PersonInfoAnnotation {
    //名字
    String name();

    //年龄
    int age() default 19;

    //性别
    String gender() default "男";

    //开发语言
    String[] language();




}
