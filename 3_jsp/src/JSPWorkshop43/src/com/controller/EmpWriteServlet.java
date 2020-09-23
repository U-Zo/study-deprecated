package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String empno = request.getParameter("empno");
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        String mgr = request.getParameter("mgr");
        String sal = request.getParameter("sal");

        EmpDTO dto = new EmpDTO(Integer.parseInt(empno), ename, job,
                Integer.parseInt(mgr), null, Integer.parseInt(sal), 0, 0);

        EmpService service = new EmpService();
        int n = 0;
        n = service.insert(dto);

        if (n != 0) {
            response.sendRedirect("EmpListServlet");
        }
    }

}
