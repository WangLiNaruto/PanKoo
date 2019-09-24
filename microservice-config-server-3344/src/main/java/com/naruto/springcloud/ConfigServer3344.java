package com.naruto.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//http://localhost:3344/applicaion-dev.yml
//http://localhost:3344/applicaion/dev/master
//http://localhost:3344/master/applicaion-dev.yml
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344.class, args);
    }

}
