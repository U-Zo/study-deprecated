package com.service;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisService {
    private OracleMyBatisDAO dao;

    public OracleMyBatisService() {
        dao = new OracleMyBatisDAO();
    }

    public List<Dept> selectAll() {
        SqlSession session = null;
        List<Dept> list = null;
        try {
            session = MySqlSessionFactory.getSqlSession();
            list = dao.selectAll(session);
        } finally {
            session.close();
        }

        return list;
    }

    public Dept selectByDeptno(int deptno) {
        SqlSession session = null;
        Dept dept = null;
        try {
            session = MySqlSessionFactory.getSqlSession();
            dept = dao.selectByDeptno(session, deptno);
        } finally {
            session.close();
        }

        return dept;
    }

    public void insert(Dept dept) {
        SqlSession session = null;
        try {
            session = MySqlSessionFactory.getSqlSession();
            dao.insert(session, dept);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void delete(int deptno) {
        SqlSession session = null;
        try {
            session = MySqlSessionFactory.getSqlSession();
            dao.delete(session, deptno);
            session.commit();
        } finally {
            session.close();
        }
    }
}