package org.yangxin.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yangxin
 * @time 2018/12/19  11:04
 */
@Configuration
public class ReconfigurationSpringMvc implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/spring.html").setViewName("springmvc");
    }
}
