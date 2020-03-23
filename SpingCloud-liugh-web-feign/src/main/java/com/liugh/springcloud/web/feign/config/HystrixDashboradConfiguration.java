package com.liugh.springcloud.web.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.hystrix.contrib.sample.stream.HystrixConfigSseServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * @author by Coven
 * @Classname HystrixDashboradConfiguration
 * @Description TODO
 * @Date 2020/3/20 9:33
 */
@Configuration
public class HystrixDashboradConfiguration   {

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
       ServletRegistrationBean registrationBean  =  new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("ServletRegistrationBean");
        return registrationBean;
    }
}
