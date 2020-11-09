package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/main")
    public String main() {
        System.out.println("TestController.main--------------");
        return "main";
    }

    @RequestMapping("/loginForm")
    public String loginForm() {
        System.out.println("TestController.loginForm---------");
        return "loginForm";
    }
}
