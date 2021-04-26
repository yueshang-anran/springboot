package com.kaung.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 书
 * @date 2021/4/17 - 15:10
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello,World";
    }
}
