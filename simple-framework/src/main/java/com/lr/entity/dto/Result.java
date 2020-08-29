package com.lr.entity.dto;

import lombok.Data;

/**
 * @author liurui
 * @date 2020/8/29 23:38
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;
}
