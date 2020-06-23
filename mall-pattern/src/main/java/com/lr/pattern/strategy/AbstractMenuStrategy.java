package com.lr.pattern.strategy;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liurui
 * @date 2020/6/22 4:26 下午
 */
public abstract class AbstractMenuStrategy implements InitializingBean {

    public Object getMenu(Integer index) {
        return index;
    }

}
