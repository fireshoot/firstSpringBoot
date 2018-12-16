package org.yangxin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yangxin
 * @time 2018/12/14  11:14
 */
//标明SpringBoot的入口类
@SpringBootApplication
@ImportResource({"classpath:addressSpring.xml"})
public class Application {
    //常规的java程序入口
    public static void main(String[] args){
        //配置SpringBoot的执行入口
        SpringApplication.run(Application.class,args);
    }

}
