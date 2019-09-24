package com.naruto.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


//http://localhost:9527/microservice-dept-provider/get/1
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulGateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527.class, args);
    }

}
