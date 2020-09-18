package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;

@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String curPage = request.getParameter("curPage");
        if (curPage == null) {
            curPage = "1"; // 최초 1 설정
        }

        StudentService service = new StudentService();
        PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage)); // 페이지 번호 전송

        List<StudentDTO> list = pDTO.getList();
        int perPage = pDTO.getPerPage(); // 현재 페이지 번호
        int totalCount = pDTO.getTotalCount(); // 전체 목록 수
        int totalPage = totalCount / perPage; // 전체 페이지 개수 계산
        if (totalCount % perPage != 0) totalPage++; // 나머지 페이지 추가
        System.out.println("totalCount > " + totalCount);
        System.out.println("totalPage > " + totalPage); // 출력 준비 끝
        
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html>"
                + "<body>"
                + "<table border='1'>"
                + "<tr>"
                + "<th>학번</th>"
                + "<th>이름</th>"
                + "<th>주민번호</th>"
                + "<th>주소</th>"
                + "<th>입학년도</th>"
                + "<th>휴학여부</th>"
                + "</tr>");
        for (StudentDTO dto : list) {
            out.print("<tr>"
                    + "<td>" + dto.getStuNo() + "</td>"
                    + "<td>" + dto.getStuName() + "</td>"
                    + "<td>" + dto.getStuSsn() + "</td>"
                    + "<td>" + dto.getStuAddress() + "</td>"
                    + "<td>" + dto.getEntDate() + "</td>"
                    + "<td>" + dto.getAbsYn() + "</td>"
                    + "</tr>");
        }
        
        out.print("<tr><td colspan='6'>");
        for (int i = 1; i <= totalPage; i++) {
            if (i == Integer.parseInt(curPage)) { // 현재 페이지와 i가 일치할 경우 빨간색
                out.print("<span style='color: red;'>" + i + "</span>&nbsp;&nbsp;");
            } else {
                out.print("<a href='StudentListServlet?curPage=" + i + "'>" + i + "</a>&nbsp;&nbsp;");
            }
        }
        
        out.print("</td></tr>"
                + "</table>"
                + "</body>"
                + "</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
