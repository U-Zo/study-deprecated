package com.service;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisEmpDAO;
import com.dto.Emp;
import com.exception.RecordNotFoundException;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisEmpService {
    private final OracleMyBatisEmpDAO dao;

    public OracleMyBatisEmpService() {
        dao = new OracleMyBatisEmpDAO();
    }

    public List<Emp> selectAll() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<Emp> list = null;
        try {
            list = dao.selectAll(session);
        } finally {
            session.close();
        }

        return list;
    }

    public Emp selectByEmpno(int empno) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        Emp emp = null;
        try {
            emp = dao.selectByEmpno(session, empno);
        } catch(RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        return emp;
    }

    public void insert(Emp emp) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.insert(session, emp);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void update(Emp emp) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.update(session, emp);
            session.commit();
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }

    public void delete(int empno) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.delete(session, empno);
            session.commit();
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }
}
