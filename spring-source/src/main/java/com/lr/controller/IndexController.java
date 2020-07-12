package com.lr.controller;

import com.alibaba.fastjson.JSON;
import com.lr.dao.SmsSenderFormVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/7/6 22:04
 */
@RestController
@Slf4j
public class IndexController {
    @PutMapping("/hi")
    public void test(SmsSenderFormVO smsSenderFormVO) {
        System.out.println(smsSenderFormVO.toString());
    }

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"age\":23,\n" +
                "    \"name\":\"tom\"\n" +
                "}";

        SmsSenderFormVO smsSenderFormVO = JSON.parseObject(json, SmsSenderFormVO.class);
        List<SmsSenderFormVO> list = new ArrayList<>();



        //log.info("smsSenderFormVO is={}",JSON.toJSONString(smsSenderFormVO));
        System.out.println(smsSenderFormVO);
    }
}
