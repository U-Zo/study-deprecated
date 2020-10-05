package com.controller.main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GoodsDTO;
import com.service.GoodsService;

/**
 * 프로젝트의 시작,
 * 데이터베이스로부터 상품 목록을 받아와
 * main.jsp로 넘겨주는 서블릿
 * 
 * @author Woojo Kim
 *
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*
         *  GoodsService 객체를 생성하고
         *  top 문자열을 service의 goodsList 메서드에 전달,
         *  반환된 List 객체를 list에 저장
         */
        GoodsService service = new GoodsService();
        List<GoodsDTO> list = service.goodsList("top");
        
        // request 객체에 goodsList로 list를 저장 후 main.jsp 페이지로 이동
        request.setAttribute("goodsList", list);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
    }

}
