package com.service;

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

} // end class
