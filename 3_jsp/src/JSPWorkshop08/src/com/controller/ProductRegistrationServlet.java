package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Product> products = new HashMap<String, Product>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		Product product = products.get(id);
		if (product == null) {
			product = new Product(name, id, amount);
			products.put(id, product);
		} else {
			product.setAmount(product.getAmount() + amount);
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>"
				+ "<table border=1>"
				+ "<tr>"
				+ "<th>상품명</th>"
				+ "<th>아이디</th>"
				+ "<th>수량</th>"
				+ "</tr>");
		
		Set<String> keys = products.keySet();
		for (String key : keys) {
			Product p = products.get(key);
			String _name = p.getName();
			String _id = p.getId();
			int _amount = p.getAmount();
			out.print("<tr>"
					+ "<td>" + _name + "</td>"
					+ "<td>" + _id + "</td>"
					+ "<td>" + _amount + "</td>"
					+ "</tr>");
		}
		
		out.print("</table>"
				+ "<a href='productForm.html'>상품 입력하기</a>"
				+ "</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
