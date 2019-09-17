package com.naruto.springcloud.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 使用springcloud提供的方法设置负载均衡的算法(robbin 默认提供的集中算法)
     * @return
     */
//    @Bean
//    public IRule iRule(){
//        //return new RoundRobinRule(); //随机算法
//        //return new RandomRule(); //轮询算法
//        //return AvailabilityFilteringRule();
//        return new RetryRule();
//    }

}
