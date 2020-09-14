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

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Map<String, String[]> map = request.getParameterMap();
		out.print("<html><body>");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String[] values = map.get(key);
			String msg = "";
			for (String str : values) {
				if (key.equals("ssn")) {
					msg += str.substring(7, 8).equals("1") ? "남자" : "여자";
				} else if (key.equals("hobbies")) {
					msg += str + " ";
				} else {
					msg += str;
				}
			}

			if (key.equals("userid")) {
				out.print("이름은 " + msg + "<br />");
			} else if (key.equals("ssn")) {
				out.print("성별은 " + msg + "<br />");
			} else if (key.equals("hobbies")) {
				out.print("취미는 " + msg + "<br />");
			} else {
				out.print("결혼 여부는 " + msg + "입니다.<br />");
			}
		}
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
