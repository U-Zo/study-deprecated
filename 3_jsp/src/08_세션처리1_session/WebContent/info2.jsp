<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	info2<br />
	<%
	String username = (String) session.getAttribute("username");
	String passwd = (String) session.getAttribute("passwd");
	%>
	이름:<%=username%><br />
	비번:<%=passwd%>
</body>
</html>