package com.liugh.springcloud.web.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author by Coven
 * @Classname WebFeignApplication
 * @Description TODO
 * @Date 2020/3/17 16:02
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
public class WebFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFeignApplication.class,args);
    }
}
