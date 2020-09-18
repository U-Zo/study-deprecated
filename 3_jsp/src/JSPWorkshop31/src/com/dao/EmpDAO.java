package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
    public List<EmpDTO> selectAllEmp(SqlSession session) {
        return session.selectList("com.dto.selectAllEmp");
    }
    
    public int insertEmp(SqlSession session, EmpDTO emp) {
        return session.insert("com.dto.insertEmp", emp);
    }
}
