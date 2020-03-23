package com.liugh.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author by Coven
 * @Classname ZuulApplocation
 * @Description TODO
 * @Date 2020/3/20 11:37
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //启用zuul
public class ZuulApplocation {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplocation.class);
    }

}
