package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;

	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공");
		return "main";// main.jsp
	}

	@RequestMapping("/loginCheck/myPage")
	public String myPage(HttpSession session) {
		// 인터셉터에서 로그인 인증후 페이지 이동
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		dto = service.myPage(dto.getUserid());
		session.setAttribute("login", dto);
		return "redirect:../myPage";
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
