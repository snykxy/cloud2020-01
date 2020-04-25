package com.yanchong.ribbonRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;


/**
 * 自定义负载均衡算法
 *
 *
 * 连续调用某台机器3遍，然后再调用下台机器3遍，再调用下一台机器3遍。。。
 *
 *
 */

public class MyRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {

        ILoadBalancer lb = this.getLoadBalancer();


        return null;
    }
}
