package com.lr.spring;

import com.lr.spring.bean.BraveKnight;
import com.lr.spring.bean.Knight;
import com.lr.spring.bean.SlayDragonQuest;
import com.lr.spring.configuration.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liurui
 * @date 2020/6/24 5:12 下午
 */
public class Application {
    public static void main(String[] args) {

        /*BraveKnight braveKnight = new BraveKnight(new SlayDragonQuest());
        braveKnight.embarkOnQuest();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(KnightConfig.class);
        context.refresh();

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

    }
}
