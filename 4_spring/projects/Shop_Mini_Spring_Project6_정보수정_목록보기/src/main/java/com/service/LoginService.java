package com.service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginService {

    private final MemberDAO memberDAO;

    public LoginService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public MemberDTO login(Map<String, String> map) {
        return memberDAO.login(map);
    }
}
