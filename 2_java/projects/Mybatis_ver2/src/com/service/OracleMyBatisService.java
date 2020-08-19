package com.service;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisService {
    OracleMybatisDAO dao;

    public OracleMyBatisService() {
        dao = new OracleMybatisDAO(); // dao 생성
    }

    public List<Dept> selectAll() {
        SqlSession session = MySqlSessionFactory.getSqlSession(); // DB 연결한 SqlSession 객체를 얻어서 session 변수에 저장
        List<Dept> list = null; // Dept 객체들을 가지는 List 객체를 저장하고 반환할 변수 선언
        try {
            list = dao.selectAll(session); // dao 에 얻어온 SqlSession 객체 전달
        } finally {
            session.close(); // session 종료
        }

        return list;
    } // end class

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
