package com.controller;

import com.dto.MemberDTO;
import com.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @RequestMapping("/login")
    public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {
        MemberDTO dto = service.login(map);

        if (dto == null) {
            model.addAttribute("mesg", "아이디 또는 비밀번호가 잘못되었습니다.");
            return "loginForm";
        }

        session.setAttribute("login", dto);
        return "main";
    }

    @RequestMapping("/loginCheck/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:../";
    }
}
