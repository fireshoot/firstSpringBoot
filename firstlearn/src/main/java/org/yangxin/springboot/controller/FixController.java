package org.yangxin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangxin
 * @time 2018/12/18  12:42
 */
@Controller
public class FixController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
