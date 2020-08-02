package com.lr.test;

import com.lr.configuration.SpringAopConfiguration;
import com.lr.dao.Dao;
import com.lr.dao.IndexDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @author liurui
 * @date 2020/8/1 15:26
 */
public class SpringAopApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringAopConfiguration.class);

        Dao indexDao = (Dao) annotationConfigApplicationContext.getBean("indexDao");

        System.out.println(indexDao instanceof Proxy);
        System.out.println(indexDao instanceof IndexDao);
        indexDao.query("");
        indexDao.query();
        /**
         * Proxy(代理对象)的产生过程
         */

        /*Class<?>[] classes = {Dao.class};
        byte[] bytes = ProxyGenerator.generateProxyClass("LiuAa", classes);
        File file = new File("C:\\Users\\ALTERUI\\workspace\\mall\\spring-aop\\src\\main\\java\\com\\lr\\test\\Test.class");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
