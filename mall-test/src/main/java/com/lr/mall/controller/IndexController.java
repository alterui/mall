package com.lr.mall.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private CountNum countNum;

    @GetMapping("/get")

    public void get() throws InterruptedException {
        System.out.println("开始");
        for (int i = 0; i < 3; i++) {

           countNum.getWords();
        }
        System.out.println("end");
    }
}
