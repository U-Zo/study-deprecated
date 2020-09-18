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
	request.setAttribute("xxx", "홍길동");
	%>
	second.jsp<br />
	아래 화면은 top.jsp를 jsp:include 한 내용입니다.
	<jsp:include page="include/top.jsp"></jsp:include>
	<br />
	다시 second.jsp 내용입니다.
</body>
</html>