package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("kkk 요청");
		return "main";
	}
	
	@RequestMapping("/yyy")
	public String yyy() {
		System.out.println("yyy 요청");
		return "main";
	}

}
