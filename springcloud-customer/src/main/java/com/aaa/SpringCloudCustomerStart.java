package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 将当前应用程序注册为feign得客户端程序 ressss 111111111
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudCustomerStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomerStart.class,args);
    }
    //轮询的负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
