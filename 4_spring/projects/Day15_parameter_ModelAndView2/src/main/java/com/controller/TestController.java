package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {
	
	@RequestMapping("login")
	public String login() {
		return "loginForm";
	}

    @RequestMapping(value = "/aaa", method = RequestMethod.GET)
    public ModelAndView xxx(ArrayList<String> list) {//list객체 생성
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("홍길동3");
        list.add("홍길동4");
        ModelAndView mav = new ModelAndView();
        mav.addObject("list", list);
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping(value = "/bbb", method = RequestMethod.GET)
    public ModelAndView xxx3(@ModelAttribute("xxx") ArrayList<String> list) {//list객체 생성
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("홍길동3");
        list.add("홍길동4");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main2");
        return mav;
    }

    @RequestMapping(value = "/ccc", method = RequestMethod.GET)
    public String ccc(ArrayList<Integer> list) {//key값이 지정X=>stringList 로 자동 저장된다
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        return "main3";
    }

    @RequestMapping(value = "/ddd", method = RequestMethod.GET)
    public String ddd(HttpServletRequest request) {
        request.setAttribute("userid", "abcd");
        return "main4";
    }

    @RequestMapping(value = "/eee", method = RequestMethod.GET)
    public String eee(Login dto) {//key값이 지정X=>login 로 자동 저장된다
        dto.setUserid("abcd");
        dto.setPasswd("1234");
        return "main5";
    }

    @RequestMapping(value = "/fff", method = RequestMethod.GET)
    public ModelAndView fff(@ModelAttribute("aaa") HashMap<String, String> map) {//key값이 지정X=>stringList 로 자동 저장된다
        map.put("bb", "111");
        map.put("ccc", "111");
        ModelAndView mav = new ModelAndView();
        mav.addObject(map);
        mav.setViewName("main6");
        return mav;
    }
    
    @RequestMapping(value = "/ggg", method = RequestMethod.GET)
    public String ggg(Model model) {
        model.addAttribute("ggg", "준이");
        return "main7";
    }
    
    @RequestMapping(value = "/hhh", method = RequestMethod.GET)
    public String hhh(@ModelAttribute("userid") String name, Model model) {
    	name.concat("준이");
    	System.out.println(name);
    	model.addAttribute("userid", name);
    	return "main8";
    }
}
