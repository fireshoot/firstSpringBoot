package org.yangxin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.yangxin.springboot.controller.IndexServlet;

/**
 * @author yangxin
 * @time 2018/12/14  11:14
 */
//标明SpringBoot的入口类
@SpringBootApplication
@ImportResource({"classpath:addressSpring.xml"})
/*这个注解会在整个springBoot工程启动的时候，扫描
整个工程的Servlet组件，并且配置到环境中能够被识别。
*/
@ServletComponentScan
public class Application {
    //常规的java程序入口
    public static void main(String[] args){
        //配置SpringBoot的执行入口
        SpringApplication.run(Application.class,args);
    }
/*    @Bean
    public ServletRegistrationBean getBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new IndexServlet());
        bean.addUrlMappings("/index.html");
        return bean;
    }*/

}
