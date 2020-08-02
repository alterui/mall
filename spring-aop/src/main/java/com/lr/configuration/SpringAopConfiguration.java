package com.lr.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring aop 配置类
 * @author liurui
 * @date 2020/8/1 15:07
 */
@Configuration
@ComponentScan("com.lr")
//启用aspectj自动代理
@EnableAspectJAutoProxy(proxyTargetClass = false )
public class SpringAopConfiguration {
}
