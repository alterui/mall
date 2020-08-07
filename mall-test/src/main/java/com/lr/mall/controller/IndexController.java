package com.lr.mall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurui
 * @date 2020/8/7 9:52 上午
 */

@RestController
public class IndexController {

    @PostMapping("/get")
    public void get(@RequestBody Student student) {
        System.out.println(student);
    }
}
