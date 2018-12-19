package org.yangxin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.yangxin.springboot.dao.Student;

/**
 * @author yangxin
 * @time 2018/12/19  9:15
 */
@Controller
public class ThymeleafController {

    @GetMapping(value = "/thymeleaf.html")
    public String index(Model model){
        Student student=new Student(1,"yangxin","455fafd");
        model.addAttribute("student",student);
        return "thymeleaf";
    }

}
