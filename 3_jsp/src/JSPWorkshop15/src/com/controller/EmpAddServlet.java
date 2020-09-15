package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpAddServlet")
public class EmpAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmpService service = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        service = new EmpService();
        request.setCharacterEncoding("utf-8");
        
        int empno = Integer.parseInt(request.getParameter("empno"));
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        int mgr = Integer.parseInt(request.getParameter("mgr"));
        String hiredate = null;
        int sal = Integer.parseInt(request.getParameter("sal"));
        int comm = 0;
        int deptno = 0;
        
        EmpDTO emp = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
        service.insertEmp(emp);
        
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html>"
                + "<body>"
                + "회원가입 성공<a href='EmpListServlet'>목록보기</a>"
                + "</body>"
                + "</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
