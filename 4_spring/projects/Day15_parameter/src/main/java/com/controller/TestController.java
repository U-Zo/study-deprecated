package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("userid", id);
        mav.addObject("passwd", pw);

        mav.setViewName("login");

        return mav;
    }
}
