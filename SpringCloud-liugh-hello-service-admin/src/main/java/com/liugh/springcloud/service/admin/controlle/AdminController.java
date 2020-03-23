package com.liugh.springcloud.service.admin.controlle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by LiuGH
 * @Classname AdminController
 * @Description TODO
 * @Date 2020/3/17 12:08
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private  String port ;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        return  String.format(" hi you  message is %s port: %s",message,port);
    }
}
