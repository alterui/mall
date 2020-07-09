package com.lr.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
