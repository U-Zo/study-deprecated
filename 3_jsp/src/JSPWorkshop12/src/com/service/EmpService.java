package com.service;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpService {
  private EmpDAO dao;
  private String driver = "oracle.jdbc.driver.OracleDriver";// 오라클 드라이버 연결
  private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
  private String userid = "scott";
  private String passwd = "tiger";

  public EmpService() {
    dao = new EmpDAO();
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<EmpDTO> selectAll() {
    Connection conn = null;
    ArrayList<EmpDTO> list = null;
    try {
      conn = DriverManager.getConnection(url, userid, passwd);
      list = dao.selectAll(conn);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (conn != null) conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return list;
  }
}
