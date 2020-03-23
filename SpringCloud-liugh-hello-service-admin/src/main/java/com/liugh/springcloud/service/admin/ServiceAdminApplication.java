package com.liugh.springcloud.service.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author by Coven
 * @Classname EurekaApplication
 * @Description TODO
 * @Date 2020/3/17 11:28
 */

@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {

    /**
     * Eureka 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }

}
