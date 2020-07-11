package com.lr.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.io.Serializable;

/**
 * @author liurui
 * @date 2020/7/9 11:50 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String id;
    private Integer age;
    private String name;
    private String city;
    private Integer size;

    public Student(Integer age, Integer size) {
        this.age = age;
        this.size = size;
    }



    public static void main(String[] args) {
        Student student1 = new Student(1,3);
        Student student2 = new Student(1,4);
        Student student3 = new Student(1,6);
        Student student4 = new Student(2,5);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
    }
}
