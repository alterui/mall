package com.lr.pattern.init;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.lr.pattern.bean.Man;
import com.lr.pattern.bean.Student;
import org.apache.commons.lang.StringUtils;


import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/6/8 4:35 下午
 */
public class Application {

    public static void main(String[] args) {

        String name = "【仟寻】你好，{$var}。{$var}将于{$var}{$var}参加{$var}的面试。候选人联系方式：{$var}，谢谢！";
        String value = "interviewerName，candidateName,interviewTime,interviewType,interviewPositionTitle,candidateMobile";

        Map<String,String> params = new HashMap<>();
        params.put("interviewerName","面试官,刘瑞");
        params.put("candidateName","候选人永兵");
        params.put("interviewTime","2019-03-20 12:00");
        params.put("interviewType","远程");
        params.put("interviewPositionTitle","Java工程师");
        params.put("interviewAddress"," 地址：上海");
        params.put("candidateMobile","18019261955");

        String[] split = value.split("[,，]");

        for (String v : split) {
            if (params.get(v) != null) {
                name = name.replaceFirst("\\{\\$var\\}", params.get(v));
            }
        }


        System.out.println(name);

    }
}
