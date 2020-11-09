<%@page import="com.dto.Login" %>
<%@page import="org.springframework.web.bind.annotation.RequestParam" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
<%
    Login dto = (Login) request.getAttribute("xxx");
    String id = dto.getUserid();
    String pw = dto.getPasswd();
%>
<h1>Login2.jsp</h1>
id: ${xxx.userid}<br>
passwd: ${xxx.passwd}<br>

dto id : <%=id %>
dto pw : <%=pw %>
</body>
</html>
