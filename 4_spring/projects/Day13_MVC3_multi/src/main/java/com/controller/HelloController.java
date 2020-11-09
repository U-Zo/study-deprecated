package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/kkk2")
    public String xxx() {
        System.out.println("kkk2 요청");
        return "main";
    }

    @RequestMapping("/yyy2")
    public String xxx2() {
        System.out.println("yyy2 요청");
        return "main";
    }
}
