package com.lr.spring.test;

import javax.mail.internet.MimeUtility;
import java.io.UnsupportedEncodingException;

/**
 * @author liurui
 * @date 2020/7/13 3:56 下午
 */
public class NameTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //String name = "3834611_测试职位_0703_A01_Z_勿_张植文测试_本科_5年工作经验_15000000002_Moseeker.docx";
        String name = "测试职位";

         name  = MimeUtility.encodeText(name,"utf-8",null);
        System.out.println(name);


    }
}
