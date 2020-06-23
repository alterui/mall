package com.lr.pattern.service.impl;

import com.lr.pattern.service.IndexService;
import com.lr.pattern.strategy.AbstractMenuStrategy;
import com.lr.pattern.strategy.MenuSettingStrategyFactory;
import com.lr.pattern.strategy.impl.BeginMenuSettingStrategy;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liurui
 * @date 2020/6/22 4:16 下午
 * {@link BeanFactoryAware}
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    BeginMenuSettingStrategy beginMenuSettingStrategy;
    @Override
    public Object getMenu(Integer version) {
        AbstractMenuStrategy strategy = MenuSettingStrategyFactory.getStrategy(version);
        return strategy.getMenu(version);
    }
}
