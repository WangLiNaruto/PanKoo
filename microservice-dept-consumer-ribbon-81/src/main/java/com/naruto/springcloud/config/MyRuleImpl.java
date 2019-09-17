package com.naruto.springcloud.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

import java.util.List;
import java.util.Random;

/**
 *
 * 隔5次的轮询算法(负载均衡算法)
 * @author naruto
 */
public class MyRuleImpl extends AbstractLoadBalancerRule {

    int total=0;//当total=5时，指针才能向下走
    int index=0;//当前向外提供的服务器的指针;已经轮询过5次，index++,total=0;//当我们index等于服务器的个数时，index=0,total=0;

    //

    public MyRuleImpl() {
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;
            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }
                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                //--5的轮询算法
                if(total<5){
                    server=upList.get(index);
                    total++;
                }else{
                    total=0;
                    index++;
                    if(index>=upList.size()){
                        index=0;
                    }
                }
                //-----

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }
                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    @Override
    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
