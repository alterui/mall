package com.lr.spring;

import com.lr.spring.configuration.CDPlayerConfig;
import com.lr.spring.sound.system.CompactDisc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

@SpringBootTest
@ContextConfiguration(classes = CDPlayerConfig.class)
class MallSpringApplicationTests {


    @Qualifier("sgtPeppers")
    @Autowired
    private CompactDisc compactDisc;

    @Test
    void contextLoads() {
        System.out.println(compactDisc);
    }

}
