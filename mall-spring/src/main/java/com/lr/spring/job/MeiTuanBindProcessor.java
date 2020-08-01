package com.lr.spring.job;

import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/7/29 11:41 上午
 */
@Component
public class MeiTuanBindProcessor extends AbstractBindProcessor {
    @Override
    public String get() {
        return "meituan";
    }

    @Override
    public String getMsg() {
        return "meituan";
    }
}
