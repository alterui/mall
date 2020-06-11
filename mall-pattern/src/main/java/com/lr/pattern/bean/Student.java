package com.lr.pattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
