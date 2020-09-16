package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("InitParamServlet.doGet");
        // 초기화파라미터 얻기 1
        String userid = getInitParameter("userid");
        String email = getInitParameter("email");

        System.out.println(userid + "\t" + email);

        // 초기화파라미터 얻기 2
        Enumeration<String> enu = getInitParameterNames();
        while (enu.hasMoreElements()) {
            String key = (String) enu.nextElement();
            String value = getInitParameter(key);
            System.out.println(">> " + key + "\t" + value);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
