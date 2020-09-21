<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>url: 상대 경로</h1>
	<a href="target.jsp">A</a><br />
	<a href="<c:url value='target.jsp' />">A2</a><br />
	<h1>url: 절대 경로</h1>
	<a href="/target.jsp">B</a><br />
	<a href="<c:url value='/target.jsp' />">B2</a>
</body>
</html>