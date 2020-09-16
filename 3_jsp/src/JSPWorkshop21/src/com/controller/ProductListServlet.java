package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        HttpSession session = request.getSession();
        Enumeration<String> keys = session.getAttributeNames();
        String id = (String) session.getAttribute("delete");
        
        if (id != null) {
            session.removeAttribute(id);
            session.removeAttribute("delete");
        }

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<html>"
                + "<body>"
                + "<b>상품입력 결과</b><br />"
                + "<hr />"
                + "<table border='1'>"
                + "<tr>"
                + "<th>상품 아이디</th>"
                + "<th>상품명</th>"
                + "<th>개수</th>"
                + "</tr>");
        while (keys.hasMoreElements()) {
            Product p = (Product) session.getAttribute(keys.nextElement());
            out.print("<tr>"
                    + "<td>" + p.getId() + "</td>"
                    + "<td>" + p.getName() + "</td>"
                    + "<td>" + p.getAmount() + "</td>"
                    + "</tr>");
        }

        out.print("</table>"
                + "<a href='productForm.html'>등록화면보기</a><br />"
                + "<a href='ProductAllDeleteServlet'>전체상품삭제</a><br />"
                + "<a href='productDelete.html'>특정상품삭제</a>"
                + "</body>"
                + "</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
