package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private final String USER = "scott";
    private final String PASSWORD = "tiger";
    private OracleTxDAO dao;

    public OracleTxService() {
        // 드라이버 로딩
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // dao 생성
        dao = new OracleTxDAO();
    } // end OracleDAO

    public void insertDelete(Dept dept, int i) {
        Connection conn = connect();
        try {
            conn.setAutoCommit(false); // 자동으로 커밋하지 않음 (default: true)
            dao.insert(conn, dept);
            dao.delete(conn, i);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        } finally {
            close(conn);
        }
    }

    public ArrayList<Dept> select() {
        ArrayList<Dept> list = null;
        Connection conn = connect(); // db 연결
        try {
            // select 호출 - conn 을 인자로 넘김
            list = dao.select(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn); // connection 종료
        }

        return list;
    } // end select

    public void update(Dept xx) {
        Connection conn = connect();
        try {
            dao.update(conn, xx);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            close(conn);
        }
    }

    public void insert(Dept xx) {
        Connection conn = connect();
        try {
            dao.insert(conn, xx);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn);
        }
    } // end insert

    public void delete(int i) {
        Connection conn = connect();
        try {
            dao.delete(conn, i);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            close(conn);
        }
    } // end deletes

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void close(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
