package com.controller;

import com.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping(value = "/memberAdd")
    public String memberAdd(MemberDTO m) {
        System.out.println(m);
        return "main";
    }
}
