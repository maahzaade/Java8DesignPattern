package com.rest.full.api.springcms.filter;/*
 * Created by Mahdiye on 2021, Apr, 23
 */

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(3)
public class MyFilter_2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
