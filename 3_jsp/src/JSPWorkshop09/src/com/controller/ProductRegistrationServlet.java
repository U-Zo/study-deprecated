package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Product> products = new ArrayList<Product>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		Product p = null;
		for (Product product : products) {
			if (product.getId().equals(id)) {
				p = product;
				p.setAmount(p.getAmount() + amount);
				break;
			}
		}
		
		if (p == null) {
			p = new Product(name, id, amount);
			products.add(p);
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
		
		for (Product product : products) {
			String _name = product.getName();
			String _id = product.getId();
			int _amount = product.getAmount();
			
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
