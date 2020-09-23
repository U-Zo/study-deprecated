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
public class EmpListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String curPage = request.getParameter("curPage");
        if (curPage == null) {
            curPage = "1";
        }

        String searchName = request.getParameter("searchName");
        String searchValue = request.getParameter("searchValue");
        System.out.println(searchName + "\t" + searchValue);
        EmpService service = new EmpService();
        PageDTO pDTO = service.select(searchName, searchValue, Integer.parseInt(curPage));
        System.out.println(pDTO.getList());

        request.setAttribute("pDTO", pDTO);
        request.setAttribute("searchName", searchName);
        request.setAttribute("searchValue", searchValue);
        // forward
        RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
        dis.forward(request, response);
    }

}
