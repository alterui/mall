package com.mall.mallredisson.controller;

import com.alibaba.fastjson.JSON;
import com.mall.mallredisson.config.Service;
import com.mall.mallredisson.model.User;
import jodd.introspector.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/11/9 5:01 下午
 */
@RestController
public class HelloController {

    @Autowired
    Service service;

    @GetMapping("/hi")
    public void get(@RequestParam("optTieInReq") List<Long> optTieInReq) {

        System.out.println(optTieInReq);


    }

    @PostMapping("/get")
    public String ge1t() {

        return "1";
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {

            User user = new User(1, "3");
            list.add(user);
        }
        String string = JSON.toJSONString(list);
        System.out.println(string);
    }
}
