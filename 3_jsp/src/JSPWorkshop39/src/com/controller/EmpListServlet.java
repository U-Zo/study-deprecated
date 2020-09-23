
package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.service.EmpService;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {// 페이지 사원 리스트

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String curPage = request.getParameter("curPage");
        if (curPage == null) {
            curPage = "1";
        }
        
        EmpService service = new EmpService();
        PageDTO pdto = service.select(curPage);
        request.setAttribute("pdto", pdto);
        
        RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
        dis.forward(request, response);
    }

}
