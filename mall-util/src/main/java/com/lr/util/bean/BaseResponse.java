package com.lr.util.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liurui
 * @date 2020/9/23 2:38 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {
    private Integer status;
    private String message;
    private T data;

    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> resp = new BaseResponse<>();
        resp.setStatus(0);
        resp.setMessage("success");
        resp.setData(data);
        return resp;
    }


    public static <T> BaseResponse<T> fail(Integer code, String msg) {
        BaseResponse<T> resp = new BaseResponse<>();
        resp.setStatus(code);
        resp.setMessage(msg);
        return resp;
    }
}
