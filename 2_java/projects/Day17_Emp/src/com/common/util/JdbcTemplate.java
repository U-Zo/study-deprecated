package com.common.util;

import java.sql.*;

public class JdbcTemplate { // 드라이버 로디 및 db 연결, conn 리턴, conn.close()
    private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final static String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private final static String USER = "scott";
    private final static String PASSWORD = "tiger";

    public JdbcTemplate() {
        try {
            Class.forName(DRIVER); // 드라이버 로딩
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // conn 에 Connection 객체 세팅 후 반환
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD); // db 연결
            conn.setAutoCommit(false); // 자동으로 커밋 안 함
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn; // connection 리턴
    }

    // db 와 연결이 되어있는지 여부를 반환
    public static boolean isConnected(Connection conn) {
        boolean validConnection = true;
        try {
            //conn 이 null 이거나 conn.isClose()가 참이면 validConnection 을 false 로 설정
            if (conn == null || conn.isClosed()) {
                validConnection = false;
            }
        } catch (SQLException e) {
            // conn 의 메서드를 사용할 때 오류가 나면 conn 에 연결 정보가 없는 것
            validConnection = false;
            e.printStackTrace();
        }

        return validConnection;
    }

    // Connection 객체를 시스템에 반환한다.
    public static void close(Connection conn) {
        if (isConnected(conn)) { // conn 이 null 이 아니거나 닫히지 않았다면 close
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // PreparedStatement 객체 close
    public static void close(PreparedStatement pstmt) {
        try {
            // pstmt 가 null 이 아니거나 닫히지 않았다면 close
            if (pstmt != null || !pstmt.isClosed()) {
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ResultSet 객체 close
    public static void close(ResultSet rs) {
        try {
            // rs 가 null 이 아니거나 닫히지 않았다면 close
            if (rs != null || !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 트랜잭션 commit
    public static void commit(Connection conn) {
        try {
            if (isConnected(conn)) {
                conn.commit();
                System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 트랜잭션 rollback
    public static void rollback(Connection conn) {
        try {
            if (isConnected(conn)) {
                conn.rollback();
                System.out.println("[JdbcTemplate.rollback] : DB Successfully Rolled back!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
