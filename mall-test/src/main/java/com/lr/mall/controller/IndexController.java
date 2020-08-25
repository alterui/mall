package com.lr.mall.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/7 9:52 上午
 */

@RestController
public class IndexController {

    public static void main(String[] args) {
        Student student2 = new Student(1, 3);
        Student student1 = new Student(2, 3);

        List<Student> list = new ArrayList<>();





        String string = JSON.toJSONString(list);
        System.out.println(string);

        List<StudentVO> studentVOList = JSON.parseArray(string, StudentVO.class);
        System.out.println(JSON.toJSONString(studentVOList));

    }
}
