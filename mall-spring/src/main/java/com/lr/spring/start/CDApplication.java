package com.lr.spring.start;

import com.lr.spring.configuration.CDPlayerConfig;
import com.lr.spring.service.Animal;
import com.lr.spring.sound.system.CompactDisc;
import com.lr.spring.sound.system.impl.IndexService;
import com.lr.spring.sound.system.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author liurui
 * @date 2020/7/16 3:55 下午
 */

public class CDApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        Animal bean = context.getBean(Animal.class);
        System.out.println(bean);


    }

}
