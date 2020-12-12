package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService service;

	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {
		MemberDTO dto = service.login(map);
		System.out.println(map);
//		String nextPage=null;
		
		if (dto != null) {
			session.setAttribute("login", dto);
			return "redirect:/goodsList?gCategory=top";
//			nextPage="main";
		}else {
			session.setAttribute("mesg", "아이디 또는 비번이 잘못됬습니다");
			return "loginForm";
//			nextPage="loginForm";
		}
//		return nextPage;
	}

	@RequestMapping(value="/loginCheck/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../";//xml에 설정 main.jsp ..을이용하여
		// /loginCheck 상위주소로 이동하여 주소를 사용함
//		return "redirect:/";//xml에 설정 main.jsp
	}
}
