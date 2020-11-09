package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TestController {

    @ModelAttribute("xxx")
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("유관순");

        return list;
    }

    @ModelAttribute("zzz")
    public String getString() {
        return "모델에서 받음";
    }

    @RequestMapping("/aaa")
    public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {
        return "aaa";
    }

    @RequestMapping("/bbb")
    public String bbb(@ModelAttribute("zzz") String str) {
        return "bbb";
    }
}
