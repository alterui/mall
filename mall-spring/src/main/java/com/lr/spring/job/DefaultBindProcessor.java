package com.lr.spring.job;

import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/7/29 11:39 上午
 */
@Component
public class DefaultBindProcessor extends AbstractBindProcessor {

    @Override
    String get() {
        return "defaultBindProcessor";
    }

    @Override
    public String getMsg() {
        return "defaultBindProcessor";
    }
}
