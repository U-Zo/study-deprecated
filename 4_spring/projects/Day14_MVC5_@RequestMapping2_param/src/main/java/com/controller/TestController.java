package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String xxx() {
        System.out.println("main 호출");
        return "main";
    }

    @RequestMapping(value = "/kkk", params = "aaa=bbb")
    public String kkk() {
        System.out.println("A 호출");
        return "login";
    }

}
