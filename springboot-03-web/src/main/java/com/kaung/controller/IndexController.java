package com.kaung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author 书
 * @date 2021/4/17 - 15:14
 */
//在templates下面的所有页面，只能通过controller来跳转！
//这个需要模板引擎的支持！：thymeleaf
@Controller
public class IndexController {
    @RequestMapping("/test")
    public String index(Model model) {
        model.addAttribute("msg","<h1>hello,springboot</h1>");
        model.addAttribute("users", Arrays.asList("qinjiang","狂神"));
        return "test";
    }

    @RequestMapping("/test1")
    public String test() {
        return "test";
    }

}
