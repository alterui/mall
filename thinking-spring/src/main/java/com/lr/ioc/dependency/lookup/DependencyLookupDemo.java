package com.lr.ioc.dependency.lookup;

import com.lr.ioc.dependency.bean.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author liurui
 * @date 2020/10/18 9:56
 */
public class DependencyLookupDemo {
    public static void main(String[] args) {

        //配置XML配置文件
        //启动Spring上下文
        BeanFactory context = new ClassPathXmlApplicationContext("classpath:META-INF/dependency-lookup-context.xml");
        //实时查找
        lookupInRealTime(context);
        //延迟查找
        lookupInLazy(context);
        //根据类型查找
        lookupByType(context);
        //
        lookupCollectionByType(context);
    }

    private static void lookupCollectionByType(BeanFactory context) {
        if (context instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) context;
            Map<String, User> userMap = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有的User集合对象："+userMap);
        }
    }

    private static void lookupByType(BeanFactory context) {
        User user = context.getBean(User.class);
        System.out.println("根据类型查找："+user);
    }

    private static void lookupInLazy(BeanFactory context) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) context.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延迟查找："+user);

    }

    private static void lookupInRealTime(BeanFactory context) {
        User user = (User) context.getBean("user");
        System.out.println("实时查找："+user);
    }
}
