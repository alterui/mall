
package com.lr.spring.configuration;

import com.lr.spring.bean.BraveKnight;
import com.lr.spring.bean.Knight;
import com.lr.spring.bean.Quest;
import com.lr.spring.bean.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liurui
 * @date 2020/6/24 5:46 下午
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest();
    }
}
