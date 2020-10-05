package com.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * loginForm.jsp 페이지로 이동시키는 UI 서블릿이다.
 * 
 * @author Woojo Kim
 * 
 */
@WebServlet("/LoginUIServlet")
public class LoginUIServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // loginForm.jsp 페이지로 이동
        response.sendRedirect("loginForm.jsp");
    }

}
