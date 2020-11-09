package com.controller;

import com.dto.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping("/aaa")
    @ResponseBody
    public Login aaa() {
        Login login = new Login();
        login.setUserid("홍길동");
        login.setPasswd("1234");

        return login;
    }

    @RequestMapping("/bbb")
    @ResponseBody
    public List<Login> bbb() {
        ArrayList<Login> list = new ArrayList<>();
        list.add(new Login("홍길동", "1234"));
        list.add(new Login("이순신", "5678"));
        list.add(new Login("유관순", "9101"));

        return list;
    }

    @RequestMapping("/ccc")
    @ResponseBody
    public Map<String, List<Login>> ccc() {
        HashMap<String, List<Login>> map = new HashMap<>();

        ArrayList<Login> list = new ArrayList<>();
        list.add(new Login("홍길동1", "1234"));
        list.add(new Login("홍길동2", "5678"));
        list.add(new Login("홍길동3", "9101"));

        ArrayList<Login> list2 = new ArrayList<>();
        list2.add(new Login("유관순1", "1234"));
        list2.add(new Login("유관순2", "5678"));
        list2.add(new Login("유관순3", "9101"));

        map.put("one", list);
        map.put("two", list2);

        return map;
    }

    @RequestMapping("/ddd")
    @ResponseBody // 함수의 리턴이 클라이언트에게 보내지는 응답이 됨
    public String ddd(String message) {
        System.out.println("ddd() ========== " + message);
        return "hello!!";
    }
}
