package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

/**
 * MyBatis를 사용하여 데이터베이스에 명령을 전송하는 DAO 클래스이다.
 * 
 * @author Woojo Kim
 *
 */
public class MemberDAO {

    /**
     * 멤버 엔티티를 데이터베이스에 저장한다.
     * 
     * @param session - MyBatis 세션
     * @param dto     - MembetDTO 엔티티
     * @return insert SQL을 수행한 결과 행 수
     */
    public int memberAdd(SqlSession session, MemberDTO dto) {
        return session.insert("MemberMapper.memberAdd", dto);
    }

    /**
     * userid를 가진 USERID 컬럼이 있는지 검사하여 반환한다.
     * 
     * @param session - MyBatis 세션
     * @param userid  - 아이디를 검사할 문자열
     * @return select 결과 행의 count 수
     */
    public int idCheck(SqlSession session, String userid) {
        return session.selectOne("MemberMapper.idCheck", userid);
    }

    /**
     * map에 담겨있는 정보(userid, passwd)가 둘 다 일치하는 데이터의 수를 반환한다.
     * 
     * @param session
     * @param map
     * @return select 결과 행을 담은 MemberDTO 엔티티 객체
     */
    public MemberDTO login(SqlSession session, HashMap<String, String> map) {
        return session.selectOne("MemberMapper.login", map);
    }

}
