package com.lr.util.exception;

import com.lr.util.bean.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @ExceptionHandler({BindException.class})
    public Result handleBindException(BindException methodArgumentNotValidException) {

        List<FieldError> fieldErrors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
        Result result = new Result();
        ObjectError objectError = fieldErrors.get(0);
        result.setCode("11");
        result.setMessage(objectError.getDefaultMessage());
        return result;
    }

    private RuntimeException parseBindingResult(BindingResult bindingResult){
        Map<String,String> errorMsgs = new HashMap<String,String>();
        for (FieldError error:bindingResult.getFieldErrors()){
            errorMsgs.put(error.getField(),error.getDefaultMessage());
        }
        if(errorMsgs.isEmpty()) {
            return new RuntimeException("");
        }else {
             return new RuntimeException("");
        }
    }

}
