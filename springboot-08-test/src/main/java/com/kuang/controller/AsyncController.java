package com.kuang.controller;

import com.kuang.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 书
 * @date 2021/4/23 - 10:35
 */
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @RequestMapping("/hello")
    public String hello() {
        asyncService.hello();//停止三秒

        return "OK";
    }
}
