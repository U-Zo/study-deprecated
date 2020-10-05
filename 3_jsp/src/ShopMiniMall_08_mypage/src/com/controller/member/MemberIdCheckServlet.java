package com.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MemberService;

/**
 * memberForm.jsp로부터 userid 데이터를 받아와 검사하는 서블릿이다.
 * 데이터베이스에 userid와 같은 문자열을 가진 USERID 컬럼이 있는지 검사하고
 * 중복 여부를 메시지에 담아 전송한다.
 * 
 * @author Woojo Kim
 *
 */
@WebServlet("/MemberIdCheckServlet")
public class MemberIdCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 데이터를 파싱한다.
        String userid = request.getParameter("userid");
        
        /*
         * MemberService 객체를 생성하고 userid 데이터를 사용하여
         * 해당 객체의 idCheck 메서드를 수행한다.
         * 수행한 결과의 수를 count에 담는다.
         * count가 있으면 아이디가 있는 것이므로 아이디 중복
         * 없으면 아이디가 없는 것으로 아이디 사용 가능 메시지를 저장한다.
         */
        MemberService service = new MemberService();
        int count = service.idCheck(userid);
        String mesg = "아이디 사용 가능";
        if (count != 0) {
            mesg = "아이디 중복";
        }
        
        // 위에서 저장한 메시지를 PrintWriter 객체를 사용하여 출력한다.
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(mesg);
    }

}
