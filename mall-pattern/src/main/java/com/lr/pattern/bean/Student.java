package com.lr.pattern.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author liurui
 * @date 2020/6/8 4:32 下午
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer age;
    private String name;
    private Date time;
}
