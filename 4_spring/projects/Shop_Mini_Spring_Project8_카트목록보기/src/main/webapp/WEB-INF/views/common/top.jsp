<%@page import="com.dto.MemberDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h1>
    <a href="goodsList?gCategory=top">W Shop</a>
</h1>
<c:if test="${empty login }"> <!-- 로그인이 안 된 경우 -->
    <a href="loginForm">로그인</a>&nbsp;<!-- 링크 주소들은 servlet-context.xml에 설정되어있다 -->
    <a href="loginCheck/cartList">장바구니</a>&nbsp;
    <a href="memberForm">회원가입</a>&nbsp;<!-- 링크 주소들은 servlet-context.xml에 설정되어있다 -->
</c:if>

<c:if test="${!empty login }"> <!-- 로그인이 된 경우 -->
    안녕하세요? ${login.username} 님!<br>
    <a href="loginCheck/logout">로그아웃</a>&nbsp;
    <a href="loginCheck/myPage">MyPage</a>&nbsp;
    <a href="loginCheck/cartList">장바구니</a>&nbsp;
</c:if>
