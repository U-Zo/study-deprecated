package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private String driver = "oracle.jdbc.driver.OracleDriver";// 오라클 드라이버 연결
  private String url = "jdbc:oracle:thin:@localhost:1521:orcl";// 내컴퓨터랑 오라클 서버 연결
  private String userid = "scott";// 유저 id
  private String passwd = "tiger";// 유저 passwd

  public void init() throws ServletException {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      conn = DriverManager.getConnection(url, userid, passwd);
      String sql =
        "select empno, ename, sal, to_char(hiredate, 'yyyy/mm/dd') hiredate, deptno " +
          "from emp order by empno";

      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      out.print("<html><body>");
      out.print("" +
        "<table border=1>" +
        "<tr>" +
        "<td>사원번호</td>" +
        "<td>사원이름</td>" +
        "<td>월급</td>" +
        "<td>입사일</td>" +
        "<td>부서번호</td>" +
        "</tr>");

      while (rs.next()) {
        out.print("" +
          "<tr>" +
          "<td>" + rs.getInt("empno") + "</td>" +
          "<td>" + rs.getString("ename") + "</td>" +
          "<td>" + rs.getInt("sal") + "</td>" +
          "<td>" + rs.getString("hiredate") + "</td>" +
          "<td>" + rs.getInt("deptno") + "</td>" +
          "</tr>" +
          "");
      }
      out.print("</table>" +
        "</body></html");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  protected void doPost(
    HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    doGet(request, response);
  }

}
