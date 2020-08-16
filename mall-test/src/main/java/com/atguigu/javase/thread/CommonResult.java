package com.atguigu.javase.thread;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liurui
 * @date 2020/8/16 21:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;



    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
