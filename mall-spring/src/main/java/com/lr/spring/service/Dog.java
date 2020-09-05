package com.lr.spring.service;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author liurui
 * @date 2020/8/28 6:15 下午
 */
@Component
@Data
public class Dog implements Animal {

    @Override
    public void eat() {

    }
}
