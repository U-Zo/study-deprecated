package com.dao;

import com.dto.Dept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisDAO {
    public List<Dept> selectAll(SqlSession session) {
        List<Dept> list = null;
        list = session.selectList("selectAll");

        return list;
    }

    public Dept selectByDeptno(SqlSession session, int deptno) {
        Dept dept = null;
        dept = session.selectOne("selectByDeptno", deptno);

        return dept;
    }

    public void insert(SqlSession session, Dept dept) {
        session.insert("insertDept", dept);
    }

    public void delete(SqlSession session, int deptno) {
        session.delete("deleteDept", deptno);
    }
}