package com.interceptor;

import com.controller.TestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle================");
        HttpSession session = request.getSession();

        if (session.getAttribute("login") == null) {
            System.out.println("로그인 정보 없음");
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler==============");
        HandlerMethod method = (HandlerMethod) handler;
        if (method.getBean() instanceof TestController) {
            System.out.println("TestController인 경우 postHandler에서 view페이지 설정");
            modelAndView.setViewName("login");
            modelAndView.addObject("data", "홍길동");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion===================");
    }
}
