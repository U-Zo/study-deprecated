package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
    private EmpDAO dao;

    public EmpService() {
        dao = new EmpDAO();
    }

    public List<EmpDTO> selectAllEmp() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<EmpDTO> list = null;
        try {
            list = dao.selectAllEmp(session);
        } finally {
            session.close();
        }

        return list;
    }
    
    public void insertEmp(EmpDTO emp) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.insertEmp(session, emp);
            session.commit();
        } finally {
            session.close();
        }
    }
}
