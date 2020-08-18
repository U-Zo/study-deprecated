package com.dao;

import java.sql.*;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String sql;

    public void update(Connection conn, Dept xx) throws SQLException, RecordNotFoundException {
        int num = 0;
        sql = "update dept " +
                "set dname = ?, loc = ? " +
                "where deptno = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, xx.getDname());
        pstmt.setString(2, xx.getLoc());
        pstmt.setInt(3, xx.getDeptno());
        num = pstmt.executeUpdate();
        if (num == 0) {
            throw new RecordNotFoundException("수정할 데이터가 존재하지 않습니다.");
        }
    } // end upate

    public void delete(Connection conn, int i) throws SQLException, RecordNotFoundException {
        int num = 0;
        sql = "delete from dept where deptno = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, i);
        num = pstmt.executeUpdate();
        if (num == 0) {
            throw new RecordNotFoundException("삭제할 데이터가 존재하지 않습니다.");
        }
    }

    public void insert(Connection conn, Dept xx) throws SQLException {
        sql = "insert into dept values(?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, xx.getDeptno());
        pstmt.setString(2, xx.getDname());
        pstmt.setString(3, xx.getLoc());
        pstmt.executeUpdate();
    } // end insert

    public ArrayList<Dept> select(Connection conn) throws SQLException {
        ArrayList<Dept> list = new ArrayList<>();

        // conn 사용
        sql = "select * from dept";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int deptno = rs.getInt(1);
            String dname = rs.getString(2);
            String loc = rs.getString(3);

            list.add(new Dept(deptno, dname, loc));
        }

        // 사용 후 rs, pstmt 만 close
        close();

        return list;
    } // end select

    public void close() throws SQLException {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
    }
}
