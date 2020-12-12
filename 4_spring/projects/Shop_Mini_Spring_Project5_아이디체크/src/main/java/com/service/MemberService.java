package com.service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO dao;

    public MemberService(MemberDAO dao) {
        this.dao = dao;
    }

    public void memberAdd(MemberDTO m) {
        dao.memberAdd(m);
    }

    public MemberDTO login(Map<String, String> map) {
        return dao.login(map);
    }

    public MemberDTO myPage(String userid) {
        return dao.myPage(userid);
    }
}
