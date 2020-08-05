package com.lr.mall.test;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author liurui
 * @date 2020/7/27 3:43 下午
 */
public class Application {
    public static void main(String[] args) {
        String str = "api/common/export/application/v6/application/download/f67f270d-4734-4dd7-99d8-5ad35368bdab?appid=A11017&interfaceid=A11017001";
        String str2 = "api/common/export/application/v6/application/download/6dbb29ad-65ad-4440-9d98-3c098bf62b38?appid=A11017&interfaceid=A11017001";
        String str1 = "/api/common/export/application/v6/application/download/f67f270d-4734-4dd7-99d8-5ad35368bdab";

        String[] split = str.split("/download/");
        String s = split[1];
        System.out.println(split.length);
        String substring = s.substring(0, 36);
        System.out.println(substring);
        System.out.println(substring.length());
        //System.out.println(s);
      /*  System.out.println(str1.length());

        String substring = str.substring(78, 114);
        System.out.println(substring);
        System.out.println(substring.length());
        String ll = "f67f270d-4734-4dd7-99d8-5ad35368bdab";
        System.out.println(ll.length());*/

    }


}
