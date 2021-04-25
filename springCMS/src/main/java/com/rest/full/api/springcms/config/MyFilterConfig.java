package com.rest.full.api.springcms.config;/*
 * Created by Mahdiye on 2021, Apr, 24
 */

import com.rest.full.api.springcms.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean(){
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers/*");
        return registrationBean;
    }
}
