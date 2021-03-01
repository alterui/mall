package com.lr.mall.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author liurui
 * @date 2020/11/17 5:18 下午
 */
@AllArgsConstructor
public class User {
    public static void main(String[] args) {
        int a =1;
        int b = 0;
        switch (a) {
            case 1:
                b =1;


            case 3:
                b =3;
                System.out.println("这里执行了");


            default:
                b = 333;

        }

        System.out.println(b);
    }

}
