package com.jw.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 主程序
 *      1.引入重写的两个配置类
 *      2.排除spring-security认证 实现免登陆
 *
 * @ClassName: FlowableApplication
 * @author: Jack Chan
 * @date: 2019/6/17  10:33
 */
@SpringBootApplication(
        exclude = {SecurityAutoConfiguration.class})
public class FlowableApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableApplication.class, args);
    }

}
