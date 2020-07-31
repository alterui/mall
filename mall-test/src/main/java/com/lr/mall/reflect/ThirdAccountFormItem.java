package com.lr.mall.reflect;

import java.lang.annotation.*;

/**
 * @author liurui
 * @date 2020/7/30 3:27 下午
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ThirdAccountFormItem {

    String name() default "";

    String text() default "";

    String type() default "";

    String[] rules() default {};
}
