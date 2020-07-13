package com.lr.start;

import com.lr.config.SpringConfig;
import com.lr.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liurui
 * @date 2020/7/12 13:57
 */
public class ApplicationWithAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        IndexService indexService =
                (IndexService) annotationConfigApplicationContext.getBean("indexService");
        indexService.test();
    }
}
