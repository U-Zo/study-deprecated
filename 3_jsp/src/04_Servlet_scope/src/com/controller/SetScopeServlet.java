package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // request scope에 저장, 한 번 응답이 이루어지면 request는 삭제
        request.setAttribute("request", "홍길동");

        // session scope에 저장, 브라우저 주기
        HttpSession session = request.getSession();
        session.setAttribute("session", "이순신");

        // application scope에 저장, context 주기
        ServletContext ctx = getServletContext();
        ctx.setAttribute("application", "유관순");
        
        System.out.println("request: 홍길동");
        System.out.println("session: 이순신");
        System.out.println("application: 유관순");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
