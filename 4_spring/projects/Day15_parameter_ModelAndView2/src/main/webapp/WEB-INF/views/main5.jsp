<%@page import="com.dto.Login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Login dto=(Login)request.getAttribute("login");
	String id=dto.getUserid();
	String pw=dto.getPasswd();
%>
	<h1>Main5.jsp</h1><br>
	 ${login}<br>
	 
	 get: <%=id%>,<%=pw %>
</body>
</html>