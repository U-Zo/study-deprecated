package com.dao;

import com.dto.Dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;

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

    public void insert() {
    }

    public void update() {
    }

    public void delete() {
    }

    public static OracleDAO getDao() {
        if (dao == null) dao = new OracleDAO();

        return dao;
    }

    public void getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url, user, password);
        }
    }

    public void disconnection() throws SQLException {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
}
