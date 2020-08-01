package com.lr.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 定义一个切面
 *
 * @author liurui
 * @date 2020/8/1 15:12
 */
@Component
@Aspect
public class Aop {

    /**
     * 定义一个切点,
     * com.lr.dao包以及子包:execution(* com.lr.dao..*.*(..))
     * com.lr.dao下面的包：execution(* com.lr.dao.*.*(..))
     */
    @Pointcut("execution(* com.lr.dao..*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }
}
