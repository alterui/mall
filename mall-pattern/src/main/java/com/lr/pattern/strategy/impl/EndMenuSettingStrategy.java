package com.lr.pattern.strategy.impl;

import com.lr.pattern.strategy.AbstractMenuStrategy;
import com.lr.pattern.strategy.MenuSettingStrategyFactory;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/6/22 5:00 下午
 */
@Component
public class EndMenuSettingStrategy extends AbstractMenuStrategy {

    @Override
    public void afterPropertiesSet() {
        MenuSettingStrategyFactory.register(2, this);
    }

    @Override
    public Object getMenu(Integer index) {
        return "这里是结束菜单。";
    }
}
