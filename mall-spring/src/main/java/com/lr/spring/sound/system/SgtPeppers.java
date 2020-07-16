package com.lr.spring.sound.system;

import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/7/16 6:40 下午
 */
@Component("aa")
public class SgtPeppers implements CompactDisc{
    @Override
    public String toString() {
        return super.toString()+"我";
    }

    @Override
    public void play() {

    }
}
