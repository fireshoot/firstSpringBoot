package org.yangxin.springboot.web;

import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author yangxin
 * @time 2018/12/18  10:28
 */
//urlPatterns 是拦截的目标地址
//@WebFilter(urlPatterns = "/index.html")
public class IndexFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest rq=(HttpServletRequest)servletRequest;
        String url=rq.getRequestURI();
        if(url.contains("favicon.ico"))
            return;
        System.out.println("MyFilter 拦截器入口！");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("MyFilter 拦截器放行");
    }
    @Override
    public void destroy() {
    }
}
