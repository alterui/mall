package com.lr.test;

import com.lr.configuration.SpringAopConfiguration;
import com.lr.dao.IndexDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liurui
 * @date 2020/8/1 15:26
 */
public class SpringAopApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringAopConfiguration.class);

        IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);

        indexDao.query("");
        indexDao.query();

    }
}
