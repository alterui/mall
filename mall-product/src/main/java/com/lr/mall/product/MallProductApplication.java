package com.lr.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合mybatis配置
 *   1).导入依赖
 *      <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.2</version>
 *      </dependency>
 *
 *   2).配置
 *      1.配置数据源
 *          1)导入数据库驱动
 *          2)在application.yml中配置数据源信息
 *      2.配置Mybatis-plus
 *          1)使用@MapperScan
 *          2)告诉mybatis-plus，sql映射文件的位置
 *
 */

@SpringBootApplication
@MapperScan("com.lr.mall.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
