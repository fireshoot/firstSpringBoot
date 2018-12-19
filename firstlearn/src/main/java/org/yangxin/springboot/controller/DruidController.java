package org.yangxin.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @author yangxin
 * @time 2018/12/19  15:19
 */
@Controller
public class DruidController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/test.html")
    public String druid(Model model){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        model.addAttribute("users",maps);
        return "druidtest";
    }

}
