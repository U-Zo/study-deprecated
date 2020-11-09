package com.controller;

import com.dto.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        System.out.println("loginForm() 수행");
        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login1(Login dto) {
        System.out.println("/login post data dto" + dto);
        return "loginForm";
    }

    @RequestMapping(value = "/login2")
    public String login2(@RequestParam("userid") String id,
                         @RequestParam("passwd") String passwd) {
        System.out.println("@RequestParam parsing ======== " + id + "\t" + passwd);
        return "login";
    }

//    @RequestMapping(value = "/login2")
//    public String login2(HttpServletRequest request) {
//        String id = request.getParameter("userid");
//        String password = request.getParameter("passwd");
//        System.out.println("@RequestParam parsing ======== " + id + "\t" + passwd);
//        return "login";
//    }

    @RequestMapping(value = "/login3")
    public String login3(@RequestParam("userid") String id,
                         @RequestParam("passwd") String passwd,
                         Model model) {
        System.out.println("@RequestParam parsing ======== " + id + "\t" + passwd);
        model.addAttribute("userid", id);
        return "login";
    }
}
