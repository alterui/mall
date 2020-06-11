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

        String first = "{\n" +
                "\t\"title\":\"liurui\",\n" +
                "\t\"pageNumber\":1,\n" +
                "\t\"pageSize\":10\n" +
                "}";


       // System.out.println(first);
        System.out.println();
        String substring = first.substring(0, first.length() - 1);
        substring = substring + ",";


        Student student = new Student(1, "as");
        String string = JSON.toJSONString(student);
        System.out.println(string);
        String substring1 = string.substring(1);
        System.out.println(substring1);

        substring = substring + substring1;


        System.out.println(substring);
    }
}
