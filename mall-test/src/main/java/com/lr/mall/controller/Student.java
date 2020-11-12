package com.lr.mall.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author liurui
 * @date 2020/8/7 10:13 上午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer age;
    private String name;
}
