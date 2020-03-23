package com.liugh.springcloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author by LiuGH
 * @Classname EurekaApplication
 * @Description TODO
 * @Date 2020/3/17 11:28
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * Eureka 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }

}
