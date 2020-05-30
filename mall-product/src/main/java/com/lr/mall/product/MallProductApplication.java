package com.lr.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
 * 2.整合nacos服务注册与发现
 *   官方文档：https://github.com/alibaba/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-discovery-example/readme-zh.md
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
 *     或者  spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848
 *     5)在启动类添加@EnableDiscoveryClient注解
 *
 *
 * 3.远程调用服务过程
 *    1)引入spring-cloud-starter-openfeign 依赖
 *    2)编写一个接口，把远程调用的方法的签名写入。
 *        1.在类上注入@FeignClient(name = "mall-coupon")，name表示远程的服务名称。
 *    3)开启远程调用功能。
 *       1.@EnableFeignClients("com.lr.mall.product.feign")，扫描引入的远程调用的包。
 *
 * 4.配置统一配置中心功能。
 *  官方文档：https://github.com/alibaba/spring-cloud-alibaba/blob/master/spring-cloud-alibaba-examples/nacos-example/nacos-config-example/readme-zh.md
 *     1).引入nacos config starter pom
 *               <dependency>
 *                      <groupId>com.alibaba.cloud</groupId>
 *                      <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *               </dependency>
 *
 *    2).在应用的 /src/main/resources/bootstrap.properties 配置文件中配置 Nacos Config 元数据
 *          spring.application.name=mall-product
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *    3).在nacos配置中心页面插入Data Id为mall-product.properties(应用名+properties),
 *    并添加配置。
 *    4). 添加@RefreshScope刷新注解。
 *    5). nacos配置中心的优先级大于application.properties中的配置。
 *    6).细节描述
 *         1.命名空间
 *         2.配置集
 *         3.配置集分组
 *         4.配置集ID
 *
 *
 *
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.lr.mall.product.feign")
@MapperScan(basePackages = {"com.lr.mall.product.dao"})
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
