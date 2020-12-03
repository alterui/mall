package com.lr.concurrent.volatiled;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/18 3:52 下午
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
    private Integer age;
    private String name;

    public static void main(String[] args) {
        Student student = new Student();
        List list = new ArrayList();
        list.add(student);
        list.clear();
        System.out.println(list.size());
    }
}
