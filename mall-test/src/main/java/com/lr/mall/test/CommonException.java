package com.lr.mall.test;

import lombok.Data;

/**
 * @author liurui
 * @date 2020/6/3 3:11 下午
 */
@Data
public class CommonException<T> {

    private T code;
    private T msg;
}


