package com.naruto.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.naruto.springcloud"})
public class DeptConsumerFeign82 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign82.class, args);
    }

}
