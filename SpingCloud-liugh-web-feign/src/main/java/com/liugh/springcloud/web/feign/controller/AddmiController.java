package com.liugh.springcloud.web.feign.controller;

import com.liugh.springcloud.web.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by LiuGH
 * @Classname AddmiController
 * @Description TODO
 * @Date 2020/3/17 16:09
 */
@RestController
public class AddmiController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "hi" , method =  RequestMethod.GET)
    public String sayHi (String message){
        return this.adminService.sayHi( message);
    }
}
