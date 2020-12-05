package com.lr.mall.controller;

import lombok.Data;

import java.util.List;

/**
 * @author liurui
 * @date 2020/12/4 20:43
 */

@Data
public class PositionVO {
    private List<Student> studentList;
    private Info info;

}
