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
    public void pointCutExecution() {}


    /**
     * within仅能匹配到包和接口
     * @Pointcut("within(com.lr.dao.*)") 匹配com.lr.dao中的任意方法。
     * @Pointcut("within(com.lr.dao..*)") 匹配com.lr.dao包以及子包的任意方法。
     */
    @Pointcut("within(com.lr.dao.*)")
    public void pointCutWithin() {}

    /**
     * 只写一个类就报错，说是一个final修饰的，不知道为啥？？
     */
    @Pointcut("args(java.lang.String,*)")
    public void pointCutArgs(){}

    @Before("pointCutWithin()")
    public void before() {
        System.out.println("before");
    }



}
