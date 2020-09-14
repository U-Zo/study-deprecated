package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String birthDay = request.getParameter("birthday");
		String type = request.getParameter("type");
		String ageType = null;
		int price = Integer.parseInt(type);
		Calendar cal = Calendar.getInstance(); // 현재 날짜
		// cal.get(Calndar.YEAR): 파싱한 데이터에서 연도 4자리만 추출
		int age = cal.get(Calendar.YEAR) - Integer.parseInt(birthDay.split("/")[0]) + 1;

		if (age < 19) {
			price = (int) (price * 0.6);
			ageType = "미성년자";
		} else if (age >= 60) {
			price = (int) (price * 0.5);
			ageType = "경로우대";
		} else {
			price = (int) (price * 0.9);
			ageType = "성인";
		}

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>"
				+ "<b>입력한 생년월일: " + birthDay + ", 선택한 티켓: " + type + "</b><br />"
				+ "나이: " + age + ", 등급: " + ageType + ", 할인 적용 금액: " + price + "원"
				+ "</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
