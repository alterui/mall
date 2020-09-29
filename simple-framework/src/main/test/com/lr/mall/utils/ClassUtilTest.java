package com.lr.mall.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.simple.framework.util.ClassUtil;

import java.util.Set;

/**
 * @author liurui
 * @date 2020/9/29 12:03 下午
 */

public class ClassUtilTest {

    @Test
    @DisplayName("提取目标方法：extraPackageTest")
    public void extractPackageTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.lr.entity");

        System.out.println(classSet.size());
    }
}
