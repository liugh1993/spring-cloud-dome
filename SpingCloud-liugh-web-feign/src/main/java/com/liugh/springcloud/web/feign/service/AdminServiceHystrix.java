package com.liugh.springcloud.web.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author by LIuGH
 * @Classname AdminServiceHystrix
 * @Description TODO
 * @Date 2020/3/20 9:28
 */
@Component
public class AdminServiceHystrix  implements AdminService{

    @Override
    public String sayHi(String message) {
        return String.format("你好 错误:%s , 啊出现熔断了!",message);
    }
}
