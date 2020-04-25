package com.yanchong.ribbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 注意，ribbon官方明确规定，负载均衡类不能放到componentscan能够扫描到的包下，
 * 否则，自己定制的配置类会被所有的ribbon客户端所共享，达不到特殊定制的目的
 *
 *
 *
 */

@Configuration
public class RuleConfig {


    @Bean
    public IRule getIRule(){
       return new RandomRule();     //采用随机的负载均衡算法
    }

}
