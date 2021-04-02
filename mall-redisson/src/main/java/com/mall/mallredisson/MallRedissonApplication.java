package com.mall.mallredisson;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootApplication
public class MallRedissonApplication {

    @Autowired
    MallRedissonApplication mallRedissonApplication;
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        classPathXmlApplicationContext.getBean()
    }

    @Before

    public void a(){
        System.out.println();
        //jdk代理
        //clig代理
    }

    class $s extends MallRedissonApplication{

    }

}
