package com.liugh.springcloud.web.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author by Coven
 * @Classname AdminService
 * @Description TODO
 * @Date 2020/3/17 16:07
 */
@FeignClient(value ="SpringCloud-liugh-hello-service-admin" , fallback =  AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi",method =  RequestMethod.GET)
    public String sayHi(@RequestParam(value ="message") String message);

}
