package com.LiuFangbao.Lab2;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import java.io.IOException;


public class LiuFangbaoFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("LiuFangbaoFilter-->before chain");
        chain.doFilter(request, response);
        System.out.println("LiuFangbaoFilter-->after chain");
    }
}

