package com.lr.start;

import com.lr.service.IndexService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liurui
 * @date 2020/7/4 17:35
 */

public class ApplicationWithXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        IndexService indexService = (IndexService) classPathXmlApplicationContext.getBean("indexService");
        indexService.test();
    }
}
