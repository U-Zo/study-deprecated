package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {
    public ArrayList<EmpDTO> selectAllEmp(Connection conn) {
        ArrayList<EmpDTO> list = new ArrayList<>(); // EmpDTO 객체들을 저장할 ArrayList 객체 생성
        PreparedStatement pstmt = null; // sql 문 처리할 PreparedStatement 객체 생성
        ResultSet rs = null; // sql 문 처리 결과를 저장할 ResultSet 객체 생성
        String sql = "select * from emp"; // sql 문 작성
        try {
            pstmt = conn.prepareStatement(sql); // sql 문 처리할 객체에 입력
            rs = pstmt.executeQuery(); // sql 문 처리 및 결과 rs 객체에 저장
            while (rs.next()) { // rs에 다음 데이터가 있다면
                int empno = rs.getInt(1); // empno 에 1번째 컬럼 데이터 저장
                String ename = rs.getString(2); // ename 에 2번째 컬럼 데이터 저장
                String job = rs.getString(3); // job 에 3번째 컬럼 데이터 저장
                int mgr = rs.getInt(4); // mgr 에 4번째 컬럼 데이터 저장
                String hiredate = rs.getString(5); // hiredate 에 5번째 컬럼 데이터 저장
                double sal = rs.getDouble(6); // sal 에 6번째 컬럼 데이터 저장
                double comm = rs.getDouble(7); // comm 에 7번째 컬럼 데이터 저장
                int deptno = rs.getInt(8); // deptno 에 8번째 컬럼 데이터 저장
                // ArrayList에 EmpDTO 객체 생성하고 추가
                list.add(new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcTemplate.close(rs); // ResultSet 객체 종료
            JdbcTemplate.close(pstmt); // PreparedStatment 객체 종료
        }

        return list; // ArrayList 객체를 호출한 곳으로 반환
    }

    //사원번호로 찾기
    public EmpDTO selectDetailEmp(Connection conn, int eno) throws DataNotFoundException {
        //select 후 jdbcTemplate 이용 close
        EmpDTO empDTO = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from emp where empno = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, eno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                empDTO = new EmpDTO();
                empDTO.setEmpno(rs.getInt(1));
                empDTO.setEname(rs.getString(2));
                empDTO.setJob(rs.getString(3));
                empDTO.setMgr(rs.getInt(4));
                empDTO.setHiredate(rs.getString(5));
                empDTO.setSal(rs.getDouble(6));
                empDTO.setComm(rs.getDouble(7));
                empDTO.setDeptno(rs.getInt(8));
            }
            if (empDTO == null) {
                throw new DataNotFoundException("검색하는 데이터가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcTemplate.close(rs);
            JdbcTemplate.close(pstmt);
        }

        return empDTO;
    }

    public void empUpdate(Connection conn, EmpDTO empDTO) throws DataNotFoundException {
        PreparedStatement pstmt = null;
        String sql = "update emp set " +
                "ename = ?, job = ?, mgr = ?, hiredate = ?, " +
                "sal = ?, comm = ?, deptno = ? " +
                "where empno = ?";
        int num = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, empDTO.getEname());
            pstmt.setString(2, empDTO.getJob());
            pstmt.setInt(3, empDTO.getMgr());
            pstmt.setString(4, empDTO.getHiredate());
            pstmt.setDouble(5, empDTO.getSal());
            pstmt.setDouble(6, empDTO.getComm());
            pstmt.setInt(7, empDTO.getDeptno());
            pstmt.setInt(8, empDTO.getEmpno());
            num = pstmt.executeUpdate();
            if (num == 0) {
                throw new DataNotFoundException("수정할 데이터가 없습니다.");
            }
            JdbcTemplate.commit(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcTemplate.rollback(conn);
        } finally {
            JdbcTemplate.close(pstmt);
        }
    }

    public void empDelete(Connection conn, int empno) throws DataNotFoundException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "delete from emp where empno = ?";
        int num = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, empno);
            num = pstmt.executeUpdate();
            if (num == 0) {
                throw new DataNotFoundException("삭제할 데이터가 없습니다.");
            }
            JdbcTemplate.commit(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcTemplate.rollback(conn);
        } finally {
            JdbcTemplate.close(pstmt);
        }
    }
}
