
package com.lr.spring.sound.system.impl;

import com.lr.spring.sound.system.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/7/16 3:47 下午
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
