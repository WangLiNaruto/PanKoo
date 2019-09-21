package com.naruto.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan("com.naruto.springcloud.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix//开启Hystrix
public class DeptProviderHystrix8004 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8004.class, args);
    }

}
