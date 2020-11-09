package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/aaa")
    public String xxx(Model model) {
        model.addAttribute("zzz", "성원이 바보");

        return "aaa";
    }

    @RequestMapping("/bbb")
    public String xxx2(Map<String, String> map) {
        map.put("username", "박성원");
        map.put("address", "서울");
        return "main2";
    }
}
