package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

    public List<EmpDTO> select(SqlSession session) {
        return session.selectList("com.dto.selectAll");
    }

    public EmpDTO retrieve(SqlSession session, int empno) {
        return session.selectOne("com.dto.selectByEmpno", empno);
    }

    public int insert(SqlSession session, EmpDTO dto) {
        return session.insert("com.dto.insert", dto);
    }

}
