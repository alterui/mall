package com.mall.mallredisson.controller;

import jodd.introspector.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liurui
 * @date 2020/11/9 5:01 下午
 */
@Controller
public class HelloController {

    @GetMapping("hi")
    public void get() {
        System.out.println("enter");

    }
}
