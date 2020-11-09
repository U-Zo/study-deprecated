package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello") // 클래스 레벨에서 매핑
public class HelloController {

    @RequestMapping("/kkk")
    public String kkk() {
        System.out.println("HelloController의 kkk 요청");
        return "login";
    }
}
