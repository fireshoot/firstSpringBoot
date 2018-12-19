package org.yangxin.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangxin
 * @time 2018/12/19  14:07
 */
@Configuration
public class DruidConfiguration {

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource dataSource(){
        return  new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean getViewServlet(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new StatViewServlet());
        bean.setUrlMappings(Arrays.asList(new String[]{"/druid/*"}));
        Map<String,String> initParams=new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");//表示允许任何ipd地址都可以访问。
        bean.setInitParameters(initParams);
        return bean;
    }

    @Bean
    public FilterRegistrationBean getViewFilter(){
        FilterRegistrationBean bean=new FilterRegistrationBean(new WebStatFilter());
        bean.setUrlPatterns(Arrays.asList(new String[]{"/*"}));//设置拦截地址
        //不能拦截所有的请求，有些静态资源，或者druid后台请求都是要排除到拦截范围外
        Map<String,String> initParms=new HashMap<>();
        initParms.put("exclusions","*.js,*.css,*.jpg,*.peg,/druid/*");
        bean.setInitParameters(initParms);
        return bean;
    }


}
