package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 注册成eureka得客户端
// @EnableEurekaClient
// EnableEurekaClient只支持Eureka注册中心，EnableDiscoveryClient支持所有得注册中心
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPorductBStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPorductBStart.class,args);
    }
}
