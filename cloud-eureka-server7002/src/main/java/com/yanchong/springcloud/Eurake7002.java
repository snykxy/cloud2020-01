package com.yanchong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurake7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eurake7002.class,args);
    }
}
