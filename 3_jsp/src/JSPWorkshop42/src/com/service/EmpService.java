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

    public List<EmpDTO> select() {
        SqlSession session = MySqlSessionFactory.getSession();
        List<EmpDTO> list = null;
        try {
            list = dao.select(session);
        } finally {
            session.close();
        }

        return list;
    } // end select

    public EmpDTO retrieve(int empno) {
        SqlSession session = MySqlSessionFactory.getSession();
        EmpDTO dto = null;
        try {
            dto = dao.retrieve(session, empno);
        } finally {
            session.close();
        }

        return dto;
    }

    public int insert(EmpDTO dto) {
        SqlSession session = MySqlSessionFactory.getSession();
        int n = 0;
        try {
            n = dao.insert(session, dto);
            session.commit();
        } finally {
            session.close();
        }

        return n;
    }

}
