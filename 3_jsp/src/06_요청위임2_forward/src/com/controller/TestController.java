package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestController")
public class TestController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("TestController.doGet");

        // hellp.jsp 선택(요청)
        request.setAttribute("request", "홍길동");

        HttpSession session = request.getSession();
        session.setAttribute("session", "이순신");

        ServletContext ctx = getServletContext();
        ctx.setAttribute("application", "유관순");

        // 2. forward 방법 다른페이지에 응답화면을 위임, request를 전달, 위임페이지에서 request 사용할 수 있음
        RequestDispatcher dis = request.getRequestDispatcher("hello.jsp");
        dis.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
