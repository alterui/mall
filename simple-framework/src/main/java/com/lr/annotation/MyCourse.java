package com.lr.annotation;

import javax.annotation.Resource;

/**
 * @author liurui
 * @date 2020/9/13 19:46
 */
@CourseInfoAnnotation(courseName = "数据结构与算法", courseTag = "算法", courseProfile = "数据结构与算法是一门基础课程，大厂面试必备")
public class MyCourse {


    @PersonInfoAnnotation(name = "tom", language = {"java", "C++", "Go"})
    private String author;

    @CourseInfoAnnotation(courseName = "Java", courseTag = "开发高级语言", courseProfile = "服务器开发最主流的语言")
    public void getCourseInfo() {

    }
}
