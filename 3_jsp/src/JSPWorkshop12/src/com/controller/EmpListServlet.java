package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private EmpService service;

  public void init() throws ServletException {
    service = new EmpService();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
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

    ArrayList<EmpDTO> list = service.selectAll();
    for (EmpDTO emp : list) {
      out.print("" +
        "<tr>" +
        "<td>" + emp.getEmpno() + "</td>" +
        "<td>" + emp.getEname() + "</td>" +
        "<td>" + emp.getSal() + "</td>" +
        "<td>" + emp.getHiredate() + "</td>" +
        "<td>" + emp.getDeptno() + "</td>" +
        "</tr>" +
        "");
    }

    out.print("</table>" +
      "</body></html");
  }

  protected void doPost(
    HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    doGet(request, response);
  }

}
