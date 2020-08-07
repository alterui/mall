package com.lr.pattern.controller;

import com.lr.pattern.bean.Student;
import com.lr.pattern.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liurui
 * @date 2020/6/12 2:31 下午
 */
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;


    @PostMapping("/get")
    public void get(@RequestBody Student student) {
        System.out.println(student);

    }


}
