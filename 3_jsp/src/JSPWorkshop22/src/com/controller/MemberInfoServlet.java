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

@WebServlet("/MemberInfoServlet")
public class MemberInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        // 세션에서 사용자 정보 얻기
        HttpSession session = request.getSession();
        MemberDTO dto = (MemberDTO) session.getAttribute("login");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");

        if (dto == null) {
            // 세션정보가 없을 경우 로그인 화면으로 유도
            response.sendRedirect("loginForm.html");
        } else {
            // 사용자 정보 출력
            out.print("이름: " + dto.getUserid() + "<br />"
                    + "주소: " + dto.getAddress() + "<br />"
                    + "이메일: " + dto.getEmail() + "<br />"
                    + "<a href='LogoutServlet'>로그아웃</a>");
        }
        out.print("</body>");
        out.print("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
