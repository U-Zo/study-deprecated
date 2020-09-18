package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.EmpDTO;

public class EmpDAO {
    public ArrayList<EmpDTO> selectAllEmp(Connection con) {
        ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select empno, ename, job, mgr, to_char(hiredate, 'yyyy-mm-dd') hiredate, sal, comm, deptno "
                + "from emp";
        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                String hiredate = rs.getString(5);
                int sal = rs.getInt(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);

                list.add(new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
