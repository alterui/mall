package com.lr.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liurui
 * @date 2021/3/27 9:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer age;
    private String name;
    private Double salary;
    private Status status;

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}

