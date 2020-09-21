<%@page import="java.util.List"%>
<%@page import="com.dto.Person"%>
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
	List<Person> list = (List) request.getAttribute("xxx");
	%>
	<h1>2. bind</h1>
	<%
	for (Person p : list) {
	%>
		<p><%= p.getUsername() %></p>
		<p><%= p.getAge() %></p>
	<%
	}
	%>
	EL: ${xxx[0].username}${xxx[0].age}<br />
	EL: ${xxx[1].username}${xxx[1].age}<br />
</body>
</html>