package com.lr.spring.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lr.spring.bean.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liurui
 * @date 2020/7/10 9:48 上午
 */
public class Test {


    public static void main(String[] args) {
        String json = "{\n" +
                "    \"positionId\": 2198541,\n" +
                "    \"processId\": 901,\n" +
                "    \"companyId\": 1134362,\n" +
                "    \"startTime\": \"2020-07-01\",\n" +
                "    \"endTime\": \"2020-08-21\",\n" +
                "    \"emailAddress\": \"liurui@moseeker.com\",\n" +
                "    \"hrId\": 82752\n" +
                "}";

        JSONObject jsonObject = JSONObject.parseObject(json);

        jsonObject.entrySet().parallelStream().forEach(e ->{
            System.out.println("k:"+e.getKey()+",v:"+e.getValue());
        });

    }
}
