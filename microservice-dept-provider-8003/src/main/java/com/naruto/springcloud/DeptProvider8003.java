package com.naruto.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.naruto.springcloud.mapper")
@EnableEurekaClient
public class DeptProvider8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class, args);
    }

}
