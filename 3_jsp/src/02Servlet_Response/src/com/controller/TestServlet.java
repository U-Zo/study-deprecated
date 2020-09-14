package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 0. 사용자 요청 데이터 추출
		// 1. 사용자 요청 데이터 처리
		// 2. 요청 완료 후 응답 처리
		response.setContentType("text/html; charset=UTF-8"); // 2-1 HTML Content 타입 설정
		PrintWriter out = response.getWriter(); // 2-2 PrintWriter 열기
		out.print("<html><body>");
		out.print("<h1>서블릿 응답처리 실습</h1>");
		out.print("<p>Hello World</p>");
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
