package com.lr.concurrent.easyexcel;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liurui
 * @date 2020/8/17 4:26 下午
 */

public class Car {
    private Integer num;
    private String name;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(Integer num, String name) {
        this.num = num;
        this.name = name;
    }
}
