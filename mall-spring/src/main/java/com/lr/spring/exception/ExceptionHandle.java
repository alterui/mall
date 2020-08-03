package com.lr.spring.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author liurui
 * @date 2020/8/3 5:48 下午
 */
@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(Exception.class)
    public String exception(Exception e) {
        return "出现异常" + e.getMessage();
    }

}
