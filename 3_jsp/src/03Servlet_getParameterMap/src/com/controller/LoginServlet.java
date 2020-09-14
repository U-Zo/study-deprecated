package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// Map 형태로 파라미터 얻기
		Map<String, String[]> map = request.getParameterMap();

		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		Set<String> keys = map.keySet(); // keySet()으로 map의 key값 추출
		for (String key : keys) { // 모든 key 조회
			String[] values = map.get(key); // key에 해당하는 String 배열을 values로 추출
			String mesg = "";
			for (String value : values) { // values의 모든 value 조회
				mesg += value; // mesg에 String 값 붙이기
			}

			out.print(key + " = " + mesg + "<br />");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
