package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");

        HttpSession session = request.getSession();
        MemberDTO sessionMember = (MemberDTO) session.getAttribute("member");
        
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        
        if (sessionMember != null && sessionMember.getName().trim().equals(name.trim())) {
            out.print("<h1>중복 데이터로 인한 학생 저장 실패</h1>"
                    + "<a href='member.html'>회원등록화면</a>");
        } else {
            MemberDTO member = new MemberDTO(name, age, address);
            session.setAttribute("member", member);
            out.print("<h1>세션에 이름/나이/주소 저장 성공</h1>"
                    + "<a href='MemberListServlet'>세션정보 보기</a>");
        }
        
        out.print("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
