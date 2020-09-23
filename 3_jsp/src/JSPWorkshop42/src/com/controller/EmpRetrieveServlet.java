package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpRetrieveServlet")
public class EmpRetrieveServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String empno = request.getParameter("empno");

        EmpService service = new EmpService();
        EmpDTO dto = service.retrieve(Integer.parseInt(empno));

        request.setAttribute("dto", dto);
        RequestDispatcher dis = request.getRequestDispatcher("retrieve.jsp");
        dis.forward(request, response);
    }

}
