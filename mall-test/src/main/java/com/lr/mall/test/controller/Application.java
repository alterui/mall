package com.lr.mall.test.controller;

import com.alibaba.fastjson.JSON;
import com.lr.mall.test.CommonException;
import com.lr.mall.test.bean.SmsSenderFormVO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liurui
 * @date 2020/6/3 3:11 下午
 */
public class Application {
    public static void main(String[] args) {
        SmsSenderFormVO vo = new SmsSenderFormVO();
        vo.setMobile("15861802908");

        Integer.parseInt(vo.getMobile());
        System.out.println(JSON.toJSONString(vo));
    }
}
