package org.yangxin.springboot.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author yangxin
 * @time 2018/12/18  15:34
 */
//@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener接口初始化：！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
