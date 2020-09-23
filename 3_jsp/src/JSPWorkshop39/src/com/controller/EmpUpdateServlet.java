package com.controller;

import java.awt.Event;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpUpdateServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		int empno=Integer.parseInt(request.getParameter("empno"));
		String job=request.getParameter("job");
		int sal=Integer.parseInt(request.getParameter("sal"));
		
		EmpDTO dto=new EmpDTO();
		dto.setEmpno(empno);
		dto.setJob(job);
		dto.setSal(sal);

		System.out.println("insert Test: "+dto);
		
		EmpService service=new EmpService();
		int num=0;
		num=service.updateByEmpno(dto);
		
		if(num!=0) {
			response.sendRedirect("EmpListServlet");
		}else {
			response.sendRedirect("EmpWriteServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
