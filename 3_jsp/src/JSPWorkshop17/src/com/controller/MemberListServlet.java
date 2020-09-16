package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        MemberDTO member = (MemberDTO) session.getAttribute("member");
        if (member != null) list.add(member);

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>"
                + "세션에 등록된 정보<br />");
        for (MemberDTO m : list) {
            out.print("<div>"
                    + m.getName() + " " + m.getAge() + " " + m.getAddress()
                    + "</div>");
        }

        out.print("<a href='member.html'>회원등록화면</a>"
                + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
