package com.lr.util.exception;

import com.lr.util.bean.Result;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author liurui
 * @date 2020/9/23 2:35 下午
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public Result handleMethodArgumentException(MethodArgumentNotValidException methodArgumentNotValidException) {
        List<ObjectError> allErrors = methodArgumentNotValidException.getBindingResult().getAllErrors();
        Result result = new Result();
        ObjectError objectError = allErrors.get(0);
        result.setCode("11");
        result.setMessage(objectError.getDefaultMessage());
        return result;
    }

}
