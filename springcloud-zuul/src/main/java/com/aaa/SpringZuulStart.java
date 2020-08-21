package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 启用网关代理 楚程杰
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringZuulStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringZuulStart.class,args);
    }
}
