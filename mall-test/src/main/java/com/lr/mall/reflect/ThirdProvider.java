package com.lr.mall.reflect;

import java.lang.annotation.*;

/**
 * @author liurui
 * @date 2020/7/28 11:33 上午
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ThirdProvider {
    String value() default "2";

}