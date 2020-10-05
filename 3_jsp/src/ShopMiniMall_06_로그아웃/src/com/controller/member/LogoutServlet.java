package com.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 세션을 정보를 삭제하여 로그아웃 기능을 수행하고 main.jsp 페이지로 이동시켜주는 서블릿이다.
 * 
 * @author Woojo Kim
 *
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // http의 세션을 받아 세션의 정보를 전부 삭제
        HttpSession session = request.getSession();
        session.invalidate();
        
        // main.jsp 페이지로 이동
        response.sendRedirect("main.jsp");
    }

}
