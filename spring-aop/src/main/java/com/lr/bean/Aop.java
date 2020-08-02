package com.lr.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

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

    /**
     * this ----> 是否使用代理对象，如果开启代理对象，则生效。
     * 通过  @EnableAspectJAutoProxy(proxyTargetClass = true ) 开启代理对象
     */
    @Pointcut("this(com.lr.dao.IndexDao)")
    public void pointCutThis(){}


    /**
     * target ----->  目标对象。
     */
    @Pointcut("target(com.lr.dao.IndexDao)")
    public void pointCutTarget(){}

   /* @Before("pointCutTarget()")
    public void before() {
        System.out.println("before");
    }*/

    /**
     *
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around("pointCutTarget()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("方法执行前会执行");
        // 得到方法执行的参数
        Object[] args = proceedingJoinPoint.getArgs();

        try {
            //方法真正的执行
            proceedingJoinPoint.proceed(args);
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
            if (args.length != 0) {
                args[0] = "1";
            }
            proceedingJoinPoint.proceed(args);
        }

        System.out.println("方法执行完，会执行到这里...");

    }



}
