package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.StdDTO;
import com.service.StdService;

@WebServlet("/StdListServlet")
public class StdListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StdService service;

    public void init() throws ServletException {
        service = new StdService();
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
                "<th>학번</th>" +
                "<th>학과번호</th>" +
                "<th>이름</th>" +
                "<th>주민번호</th>" +
                "<th>주소</th>" +
                "<th>입학년도</th>" +
                "<th>휴학여부</th>" +
                "</tr>");

        List<StdDTO> list = service.selectAllStd();
        for (StdDTO std : list) {
            out.print("" +
                    "<tr>" +
                    "<td>" + std.getStudent_no() + "</td>" +
                    "<td>" + std.getDepartment_no() + "</td>" +
                    "<td>" + std.getStudent_name() + "</td>" +
                    "<td>" + std.getStudent_ssn() + "</td>" +
                    "<td>" + std.getStudent_address() + "</td>" +
                    "<td>" + std.getEntrance_date() + "</td>" +
                    "<td>" + std.getAbsence_yn() + "</td>" +
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
