package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

/**
 * DAO와 서블릿의 데이터 전달을 수행하는 service 클래스
 * 
 * @author Woojo Kim
 *
 */
public class MemberService {
    private MemberDAO dao;

    public MemberService() {
        dao = new MemberDAO();
    }

    /**
     * DAO 객체에 dto를 전달하여 insert SQL을 수행하도록 요청하고
     * 수행된 결과 행을 받아오고 반환하는 메서드
     * 
     * @param dto - 데이터베이스에 추가할 MemberDTO 엔티티 객체
     * @return insert SQL을 수행하고 수행된 결과 행의 수
     */
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

    /**
     * DAO 객체에 userid를 전달하고 select SQL을 수행하여
     * 동일한 아이디를 갖는 데이터가 있는지 조회하고
     * 그 여부를 반환하는 메서드
     * 
     * @param userid - 데이터베이스에서 같은 USERID 컬럼 데이터에 존재하는지 검사할 문자열
     * @return select SQL을 수행하고 userid와 동일한 데이터 행의 수
     */
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

    /**
     * DAO 객체에 아이디와 비밀번호를 담은 HashMap 객체를 전달하여
     * 아이디와 비밀번호를 일치할 경우 해당 MemberDTO 엔티티 객체를 받아 반환하는 메서드
     * 
     * @param map - 아이디와 비밀번호를 담은 HashMap 객체
     * @return 해당 아이디와 비밀번호를 가진 MemberDTO 엔티티 객체
     */
    public MemberDTO login(HashMap<String, String> map) {
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
