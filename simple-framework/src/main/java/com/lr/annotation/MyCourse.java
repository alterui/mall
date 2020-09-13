package com.lr.annotation;

/**
 * @author liurui
 * @date 2020/9/13 19:46
 */
@CourseInfoAnnotation(courseName = "数据结构与算法", courseTag = "算法", courseProfile = "数据结构与算法是一门基础课程，大厂面试必备")
public class MyCourse {
    @PersonInfoAnnotation(name = "tom", language = {"java", "C++", "Go"})
    private String author;

    private void getCourseInfo() {

    }
}
