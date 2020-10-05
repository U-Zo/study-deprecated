<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
    .logo {
        font-size: 2rem;
        text-align: center;
        font-weight: bold;
    }

    .logo a {
        text-decoration: none;
    }
    
    .top {
        display: flex;
        justify-content: flex-end;
    }
    
    .top a {
        padding-left: 0.8rem;
        text-decoration: none;
    }
</style>
<div class="logo">
    <a href="main">CrackCo</a>
</div>
    <div class="top">
        <%
        MemberDTO dto = (MemberDTO) session.getAttribute("login");
        if (dto != null) {
            String username = dto.getUsername();
        %>
            <%= username %> <a href="LogoutServlet">로그아웃</a>
            <a href="MyPageServlet">MyPage</a>
        <%
        } else {
        %>
            <a href="LoginUIServlet">로그인</a>
            <a href="MemberUIServlet">회원가입</a>
        <%
        }
        %>
        <a href="">장바구니</a>
    </div>
