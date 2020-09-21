package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Person;

@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Person> list = Arrays.asList(
                new Person("홍길동", 20),
                new Person("이순신", 44),
                new Person("유관순", 17)
                );
        request.setAttribute("xxx", list);
        
        String str = "A/B/C";
        request.setAttribute("yyy", str);
        
        RequestDispatcher dis = request.getRequestDispatcher("03_forEach.jsp");
        dis.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
