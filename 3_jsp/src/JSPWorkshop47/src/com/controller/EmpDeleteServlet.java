package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.EmpService;

@WebServlet("/EmpDeleteServlet")
public class EmpDeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String empno = request.getParameter("empno");
        EmpService service = new EmpService();
        service.delete(Integer.parseInt(empno));
        response.sendRedirect("EmpListServlet");
    }// end doPost

}// end class
