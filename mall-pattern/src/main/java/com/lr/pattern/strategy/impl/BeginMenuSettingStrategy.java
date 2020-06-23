package com.lr.pattern.strategy.impl;

import com.lr.pattern.strategy.AbstractMenuStrategy;
import com.lr.pattern.strategy.MenuSettingStrategyFactory;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/6/22 4:58 下午
 */
@Component
public class BeginMenuSettingStrategy extends AbstractMenuStrategy {


    @Override
    public void afterPropertiesSet(){
        MenuSettingStrategyFactory.register(1,this);
    }


    public Object getMenu(Integer index) {
        return index + 3;
    }

}
