package com.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // System.out.println("요청 왔음");

        // 데이터 파싱 후 memberDTO 생성
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
        String username = request.getParameter("username");
        String post = request.getParameter("post");
        String addr1 = request.getParameter("addr1");
        String addr2 = request.getParameter("addr2");
        String phone1 = request.getParameter("phone1");
        String phone2 = request.getParameter("phone2");
        String phone3 = request.getParameter("phone3");
        String email1 = request.getParameter("email1");
        String email2 = request.getParameter("email2");

        MemberDTO dto = new MemberDTO(userid, passwd, username, post, addr1, addr2, phone1, phone2, phone3, email1,
                email2);

        // service에 dto 전송
        MemberService service = new MemberService();
        service.memberAdd(dto);

        // db에 insert 이후 session에 회원가입 성공 메시지 저장
        HttpSession session = request.getSession();
        session.setAttribute("memberAdd", "회원가입 성공");

        // 메인 화면으로 이동 후 회원가입 성공 시 메시지 출력
        response.sendRedirect("main.jsp");
    }

}
