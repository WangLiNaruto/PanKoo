package com.naruto;

import com.naruto.springcloud.config.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICEDEPTPROVIDER",configuration = MyRule.class)
public class DeptConsumerRibbon81 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerRibbon81.class,args);
    }
}
