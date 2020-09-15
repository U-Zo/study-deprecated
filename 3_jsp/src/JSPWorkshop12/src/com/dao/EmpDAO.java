package com.dao;

import com.dto.EmpDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
  public ArrayList<EmpDTO> selectAll(Connection conn) {
    ArrayList<EmpDTO> list = new ArrayList<>();
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String sql = "select empno, ename, sal, to_char(hiredate, 'yyyy/mm/dd') hiredate, deptno "
      + "from emp order by empno";

    try {
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        int empno = rs.getInt(1);
        String ename = rs.getString(2);
        int sal = rs.getInt(3);
        String hiredate = rs.getString(4);
        int deptno = rs.getInt(5);

        list.add(new EmpDTO(empno, ename, sal, hiredate, deptno));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return list;
  }
}
