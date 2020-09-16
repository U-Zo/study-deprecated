package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // session scope, session 열기
        HttpSession session = request.getSession();

        // application scope, ServletContext 얻어오기
        ServletContext ctx = getServletContext();

        String x = (String) request.getAttribute("request");
        String x2 = (String) session.getAttribute("session");
        String x3 = (String) ctx.getAttribute("application");
        
        System.out.println("request: " + x);
        System.out.println("session: " + x2);
        System.out.println("application: " + x3);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
