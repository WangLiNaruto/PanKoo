package com.naruto.springcloud.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author naruto
 * @name ${FILE_NAME}
 */
@Configuration
public class MyRule {
    /**
     * 自定义负载均衡轮询算法
     * 隔5次的轮询算法(负载均衡算法)
     * @return
     */
    @Bean
    public IRule iRule(){
        return new MyRuleImpl();
    }
}
