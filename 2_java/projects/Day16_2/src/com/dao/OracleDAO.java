package com.dao;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class OracleDAO {
    private static OracleDAO dao;
    private final String url;
    private final String user;
    private final String password;
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    private OracleDAO() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        user = "scott";
        password = "tiger";

        //드라이버 로딩
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    } // end OracleDAO

    public ArrayList<Dept> select() throws SQLException {
        // 전체 데이터 리턴 출력
        getConnection();
        ArrayList<Dept> list = new ArrayList<>();
        String sql = "select * from dept";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            list.add(new Dept(deptno, dname, loc));
        }

        disconnection();
        return list;
    } // end select

    public void insert(Dept dept) {
        getConnection();
        String sql = "insert into dept(deptno, dname, loc) values(?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dept.getDeptno());
            pstmt.setString(2, dept.getDname());
            pstmt.setString(3, dept.getLoc());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnection();
        }
    }

    public void update(Dept dept) throws RecordNotFoundException {
        getConnection();
        int result = 0;
        String sql = "update dept set dname = ?, loc = ? " +
                "where deptno = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dept.getDname());
            pstmt.setString(2, dept.getLoc());
            pstmt.setInt(3, dept.getDeptno());
            result = pstmt.executeUpdate();
            if (result == 0) {
                throw new RecordNotFoundException("업데이트할 자료가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnection();
        }
    }

    public void delete(int deptno) throws RecordNotFoundException {
        getConnection();
        int result = 0;
        String sql = "delete from dept where deptno = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptno);
            result = pstmt.executeUpdate();
            if (result == 0) {
                throw new RecordNotFoundException("삭제할 자료가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnection();
        }
    }

    public Dept selectByDeptNo(int deptno) throws RecordNotFoundException {
        getConnection();
        Dept dept = null;
        String sql = "select * from dept where deptno = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int _deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                dept = new Dept(_deptno, dname, loc);
            }
            if (dept == null) {
                throw new RecordNotFoundException("검색한 자료가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnection();
        }

        return dept;
    }

    public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws RecordNotFoundException {
        ArrayList<Dept> list = new ArrayList<>();
        getConnection();
        String sql = "select * from dept where dname = ? and loc = ?";
        Dept dept = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, map.get("dname"));
            pstmt.setString(2, map.get("loc"));
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                dept = new Dept(deptno, dname, loc);
                list.add(dept);
            }

            if (dept == null) {
                throw new RecordNotFoundException("검색한 자료가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnection();
        }

        return list;
    }

    public ArrayList<Dept> selectByMap(HashMap<String, String> map) throws RecordNotFoundException {
        ArrayList<Dept> list = new ArrayList<>();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Dept dept = null;
            String sql = "select * from dept where ";
            sql += key + " = ?";
            try {
                getConnection();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, map.get(key));
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
                    list.add(dept);
                }

                if (dept == null) {
                    throw new RecordNotFoundException("검색한 자료가 없습니다.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                disconnection();
            }
        }

        return list;
    }

    public static OracleDAO getDao() {
        if (dao == null) dao = new OracleDAO();

        return dao;
    }

    public void getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnection() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
