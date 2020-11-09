package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 컨트롤러 클래스 등록, xml에 빈 등록해야 함
public class TestController {

    @RequestMapping("/main") // 요청할 url
    public String main() {
        System.out.println("main");

        return "main"; // view 파일 이름, 확장자 제외
    }
}
