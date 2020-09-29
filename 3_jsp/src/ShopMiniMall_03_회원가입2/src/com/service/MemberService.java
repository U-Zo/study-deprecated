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

} // end class
