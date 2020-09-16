package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    HashMap<String, Product> map = new HashMap<String, Product>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        HttpSession session = request.getSession();
        
        Product product = (Product) session.getAttribute("product");
        Product p = map.get(product.getId());
        if (p == null && product != null) {
            map.put(product.getId(), product);
        } else {
            p.setAmount(p.getAmount() + product.getAmount());
        }
        
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("<b>상품 입력 결과</b>"
                + "<hr />"
                + "<table border='1'>"
                + "<tr>"
                + "<th>상품 아이디</th>"
                + "<th>상품명</th>"
                + "<th>개수</th>"
                + "</tr>"
                + "");
        for (Product prod : map.values()) {
            out.print("<tr>"
                    + "<td>" + prod.getId() + "</td>"
                    + "<td>" + prod.getName() + "</td>"
                    + "<td>" + prod.getAmount() + "</td>"
                    + "</tr>");
        }
        out.print("<a href='productForm.html'>등록화면보기</a>"
                + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
