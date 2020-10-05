package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {
    private MemberDAO dao;

    public MemberService() {
        dao = new MemberDAO();
    }

    // DB에 회원 정보 추가
    public int memberAdd(MemberDTO dto) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int n = 0;
        try {
            n = dao.memberAdd(session, dto);
            session.commit();
        } finally {
            session.close();
        }

        return n;
    }

    // DB에 아이디가 존재하는지 검사
    public int idCheck(String userid) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int n = 0;
        try {
            n = dao.idCheck(session, userid);
        } finally {
            session.close();
        }

        return n;
    }

    // DB에서 로그인 정보를 가진 MemberDTO 엔티티를 생성
    public MemberDTO login(HashMap<String, String> map) {
        // map을 dao에 전달 db 검색 후 사용자 정보를 MemberDTO로 리턴
        SqlSession session = MySqlSessionFactory.getSqlSession();
        MemberDTO dto = null;
        try {
            dto = dao.login(session, map);
        } finally {
            session.close();
        }

        return dto;
    }

} // end class
