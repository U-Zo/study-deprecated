package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/member")
    public String member() {
        return "member";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginForm() {
        return "logined";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }
}
