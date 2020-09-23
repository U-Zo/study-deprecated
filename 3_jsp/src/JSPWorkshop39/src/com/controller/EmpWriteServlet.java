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

/**
 * Servlet implementation class EMPInsertServlet
 */
@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//데이터 파싱
		request.setCharacterEncoding("utf-8");
		
		int empno=Integer.parseInt(request.getParameter("empno"));
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		int mgr=Integer.parseInt(request.getParameter("mgr"));
		int sal=Integer.parseInt(request.getParameter("sal"));
		
		System.out.println(empno);
		
		EmpDTO dto=new EmpDTO(empno,ename,job,mgr,null,sal,0,0);
		EmpService service=new EmpService();
		int num=0;
		num=service.insert(dto);
		
		System.out.println("insert실행결과: "+num);
		
		if (num != 0) {
            response.sendRedirect("EmpListServlet");
        }
		

	        
	        
	}//end doPost
}//end class
