package com.lr.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 *   2.整个nacos服务注册与发现
 *     1)首先引入spring-cloud-alibaba-dependencies
 *
 *      <dependencyManagement>
 *         <dependencies>
 *             <dependency>
 *                 <groupId>com.alibaba.cloud</groupId>
 *                 <artifactId>spring-cloud-alibaba-dependencies</artifactId>
 *                 <version>2.2.0.RELEASE</version>
 *                 <type>pom</type>
 *                 <scope>import</scope>
 *             </dependency>
 *         </dependencies>
 *     </dependencyManagement>
 *
 *     2)引入spring-cloud-starter-alibaba-nacos-discovery，服务注册与发现
 *          <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
 *           </dependency>
 *
 *     3)启动nacos-server
 *     4)在application.yml中配置
 *           spring.application.name=mall-product
 *     和    spring.cloud.nacos.config.server-addr=localhost:8848
 *     5)在启动类添加@EnableDiscoveryClient注解
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lr.mall.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
