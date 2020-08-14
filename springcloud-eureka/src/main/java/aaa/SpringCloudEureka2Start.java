package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 启用Eureka服务：将当前应用程序注册成Eureka注册中心(管理服务)
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEureka2Start {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka2Start.class,args);
    }
}
