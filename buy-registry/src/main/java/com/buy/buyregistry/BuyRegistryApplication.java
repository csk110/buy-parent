package com.buy.buyregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用euraka服务
public class BuyRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyRegistryApplication.class, args);
    }

}
