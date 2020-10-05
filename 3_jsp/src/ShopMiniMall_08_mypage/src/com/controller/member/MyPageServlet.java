package com.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

@WebServlet("/MyPageServlet")
public class MyPageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        MemberDTO dto = (MemberDTO) session.getAttribute("login");

        if (dto == null) {
            response.sendRedirect("LoginUIServlet");
        } else {
            String userid = dto.getUserid();
            MemberService service = new MemberService();
            dto = service.myPage(userid);
            session.setAttribute("login", dto);

            response.sendRedirect("myPage.jsp");
        }
    }

}
