package com.lr.mall.test;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * @author liurui
 * @date 2020/10/25 17:32
 */
@AllArgsConstructor
public class Test {

    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name) &&
                Objects.equals(age, test.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    public static void main(String[] args) {



    }


}
