package com.biz;

import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz { // service 클래스
    private EmpDAO dao;

    public EmpBiz() {
        dao = new EmpDAO(); // EmpDAO 객체 생성, 멤버 변수에 저장
    }

    public ArrayList<EmpDTO> selectAllEmp() {
        ArrayList<EmpDTO> list = null; // ArrayList 객체 생성
        Connection conn = JdbcTemplate.getConnection(); // Connection 객체 정보 저장
        list = dao.selectAllEmp(conn); // ArrayList 객체 정보 저장
        JdbcTemplate.close(conn); // Connection 종료

        return list; // 호출한 곳으로 ArrayList 객체 반환
    }

    public EmpDTO selectDetailEmp(int empno) throws DataNotFoundException {
        Connection conn = JdbcTemplate.getConnection();
        EmpDTO empDTO = dao.selectDetailEmp(conn, empno);
        JdbcTemplate.close(conn);

        return empDTO;
    }

    public void empUpdate(EmpDTO empDTO) throws DataNotFoundException {
        Connection conn = JdbcTemplate.getConnection();
        dao.empUpdate(conn, empDTO);
        JdbcTemplate.close(conn);
    }

    public void empDelete(int empno) throws DataNotFoundException {
        Connection conn = JdbcTemplate.getConnection();
        dao.empDelete(conn, empno);
        JdbcTemplate.close(conn);
    }
}
