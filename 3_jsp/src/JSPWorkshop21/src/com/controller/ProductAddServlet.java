package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

/**
 * Servlet implementation class ProductAddServlet
 */
@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        int amount = Integer.parseInt(request.getParameter("amount"));

        Product product = new Product(name, id, amount);
        HttpSession session = request.getSession();

        Product nProduct = (Product) session.getAttribute(id);

        if (nProduct == null) {
            session.setAttribute(id, product);
        } else {
            nProduct.setAmount(nProduct.getAmount() + amount);
            session.setAttribute(id, nProduct);
        }

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("<html><body>"
                + "<h1>상품등록성공</h1>"
                + "<a href='productForm.html'>등록화면보기</a><br />"
                + "<a href='ProductListServlet'>상품목록보기</a>"
                + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
