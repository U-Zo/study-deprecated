package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * loginForm.jsp로부터 아이디와 비밀번호를 받아 데이터베이스에 해당 아이디와 비밀번호를 검사한다.
 * 검사한 내용이 있으면 데이터를 받아와 MemberDTO 엔티티 객체를 생성하고 세션에 저장하는 서블릿이다.
 * 
 * @author Woojo Kim
 * 
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // loginForm으로부터 userid 파라미터를 받아온다.
        String userid = request.getParameter("userid");

        // loginForm으로부터 passwd 파라미터를 받아온다.
        String passwd = request.getParameter("passwd");

        // HashMap 객체를 생성하고 받아온 userid와 passwd를 할당한다.
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("userid", userid);
        map.put("passwd", passwd);

        /*
         * service 객체를 생성하고 service의 login 메서드를 수행하여 MemberDTO 엔티티 객체를 받아온다.
         */
        MemberService service = new MemberService();
        MemberDTO dto = service.login(map);

        /*
         * dto가 엔티티를 가리키고 있으면 session에 엔티티를 저장하고 main.jsp 페이지로 이동한다.
         * dto가 null이라면 LoginUIServlet 페이지로 이동한다.
         */
        if (dto != null) {
            HttpSession session = request.getSession();
            session.setAttribute("login", dto);
            response.sendRedirect("main.jsp");
        } else {
            response.sendRedirect("LoginUIServlet");
        }
    }

}
