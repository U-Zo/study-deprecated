package com.controller;

import com.dto.MemberDTO;
import com.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("/loginCheck/myPage")
    public String myPage(HttpSession session) {
        MemberDTO dto = (MemberDTO) session.getAttribute("login");
        String userid = dto.getUserid();

        dto = service.myPage(userid);
        session.setAttribute("login", dto);
        return "redirect:../myPage"; // 주소에 해당하는 페이지를 servlet-context에 등록해야 함
    }

    @RequestMapping(value = "/idDuplicateCheck", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String idDuplicateCheck(@RequestParam("id") String userid) {
        MemberDTO dto = service.myPage(userid);
        String mesg = "아이디 사용가능";
        if (dto != null) {
            mesg = "아이디 중복";
        }
        return mesg;
    }

    @RequestMapping(value = "loginCheck/memberUpdate")
    public String memberUpdate(MemberDTO m) {
        System.out.println(m);
        service.memberUpdate(m);
        return "redirect:../loginCheck/myPage";
    }
}
