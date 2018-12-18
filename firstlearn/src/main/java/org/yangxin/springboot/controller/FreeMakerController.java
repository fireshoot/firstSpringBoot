package org.yangxin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.yangxin.springboot.dao.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin
 * @time 2018/12/18  13:13
 */
@Controller
public class FreeMakerController {
    @GetMapping(value = "/freemaker.html")
    public String index(Model model){
        List<Student> list=new ArrayList<>();
        Student student1=new Student(1,"aaa","bbbb");
        Student student2=new Student(1,"1111","222");
        Student student3=new Student(1,"sss","dddd");
        Student student4=new Student(1,"aaa","xxxx");
        list.add(student1);list.add(student2);list.add(student3);list.add(student4);
        model.addAttribute("student",list);
        return "freemaker";
    }
}
