package com.controller;

import com.dto.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String xxx() {
        return "loginForm";
    }

    @RequestMapping(value = "/login3", method = RequestMethod.POST)
    public String ttt3(@ModelAttribute("xxx") Login dto) {
        return "login2";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String ttt4(Login dto) {
        System.out.println("ttt4===" + dto);
        return "login3";
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    public ModelAndView ttt9(Login dto) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("loginDTO", dto);
        mav.setViewName("login");
        return mav;
    }
}
