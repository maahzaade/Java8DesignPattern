package com.rest.full.api.springcms.filter;/*
 * Created by Mahdiye on 2021, Apr, 23
 */

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class MyFilter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
