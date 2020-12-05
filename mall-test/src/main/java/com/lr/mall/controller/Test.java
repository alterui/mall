package com.lr.mall.controller;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @author liurui
 * @date 2020/11/11 3:56 下午
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student student = new Student(1, "tom2");
        map.put(1, student);
        map.put(2, student);
        System.out.println(JSON.toJSONString(map));
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student);

        System.out.println(JSON.toJSONString(list));

        set(student);
    }

    public static void set(Student student) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "tom2"));
        list.add(new Student(2, "tom1"));
        list.add(new Student(3, "tom3"));
        list.add(new Student(4, "tom4"));

        Collections.replaceAll(list,list.get(2),student);


        PositionVO positionVO = new PositionVO();
        Info info = new Info();
        positionVO.setInfo(info);
        positionVO.getInfo().setDoc(list);
        System.out.println(JSON.toJSONString(positionVO));

        positionVO.setStudentList(Collections.singletonList(student));

        System.out.println(JSON.toJSONString(positionVO));


    }


}
