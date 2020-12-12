package com.controller;

import com.dto.MemberDTO;
import com.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @RequestMapping("/memberAdd")
    public String memberAdd(MemberDTO m, Model model) {
        service.memberAdd(m); // 회원가입 성공
        model.addAttribute("success", "회원가입 성공");
        return "main";
    }
}
