package com.lr.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/9/26 22:06
 */
public class AnnotationParser {
    /**
     * 解析类的注解
     */
    public static void parseTypeAnnotation() throws Exception {

        Class<?> clazz = Class.forName("com.lr.annotation.MyCourse");
        //获取类上面的所有的注解
        Annotation[] annotations = clazz.getAnnotations();
        Stream.of(annotations).forEach(System.out::println);
        //获取@CourseInfoAnnotation注解的value
        Stream.of(annotations).forEach(e->{
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) e;
            System.out.println(courseInfoAnnotation);
        });
    }

    /**
     * 解析成员变量上的注解
     */
    public static void parseFieldAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.lr.annotation.MyCourse");
        Field[] declaredFields = clazz.getDeclaredFields();
        Stream.of(declaredFields).forEach(e->{
            if (e.isAnnotationPresent(PersonInfoAnnotation.class)) {
                System.out.println(e.getAnnotation(PersonInfoAnnotation.class));
            }
        });
    }

    /**
     * 解析方法上面的注解
     * @throws Exception
     */
    public static void parseMethodAnnotation() throws Exception{
        Class<?> clazz = Class.forName("com.lr.annotation.MyCourse");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Stream.of(declaredMethods).forEach(e->{
            if (e.isAnnotationPresent(CourseInfoAnnotation.class)) {
                System.out.println(e.getAnnotation(CourseInfoAnnotation.class));

            }
        });

    }




    public static void main(String[] args) throws Exception{
        parseMethodAnnotation();
    }
}
