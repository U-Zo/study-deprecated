package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    // get
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String xxx() {
        System.out.println("xxx() ==============");
        return "loginForm";
    }
    
    // @RequestMapping(value = "/main", method = RequestMethod.GET)
    @GetMapping("/main")
    public String main() {
    	System.out.println("main() =============");
    	return "main";
    }

    // post
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String xxx2() {
        System.out.println("xxx2() ===============");
        return "login";
    }
}
