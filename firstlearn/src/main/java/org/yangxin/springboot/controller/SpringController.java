package org.yangxin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangxin
 * @time 2018/12/14  11:18
 */
@Controller
public class SpringController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "Hello Spring Boot!";
    }
}
