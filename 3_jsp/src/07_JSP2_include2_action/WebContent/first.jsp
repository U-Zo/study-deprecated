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
	first.jsp <br />
	아래 화면은 top.jsp:include 내용입니다. <br />
	<jsp:include page="include/top.jsp"></jsp:include>
	다시 first.jsp 내용입니다.
</body>
</html>