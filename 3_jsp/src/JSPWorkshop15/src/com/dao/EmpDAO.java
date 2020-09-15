package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
    public List<EmpDTO> selectAllEmp(SqlSession session) {
        List<EmpDTO> list = null;
        list = session.selectList("emp.selectAllEmp");

        return list;
    }
    
    public void insertEmp(SqlSession session, EmpDTO emp) {
        session.insert("emp.insertEmp", emp);
    }
}
