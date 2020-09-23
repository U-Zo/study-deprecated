package com.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpRetirieveServlet
 */
@WebServlet("/EmpRetirieveServlet")
public class EmpRetirieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		EmpDTO dto=null;
		
		int empno=Integer.parseInt(request.getParameter("empno"));
		
		EmpService service=new EmpService();
		
		dto=service.selectByEmpno(empno);
		
		System.out.println(dto);
		request.setAttribute("dto", dto);
		
		RequestDispatcher dis=request.getRequestDispatcher("retrieve.jsp");
		dis.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
