<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
MemberDTO dto = (MemberDTO) session.getAttribute("login");
if (dto != null) {
%>
    <%= dto.getUsername() %> <a href="">로그아웃</a>  
<%
} else {
%>
    <a href="LoginUIServlet">로그인</a>
    <a href="MemberUIServlet">회원가입</a>
<%
}
%>
<!-- 대부분 서블릿을 통해 view 페이지를 보여줌 -->
<a href="">장바구니</a>
<a href="">MyPage</a>
