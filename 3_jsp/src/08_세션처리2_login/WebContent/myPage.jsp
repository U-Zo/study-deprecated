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
	String userid = (String) session.getAttribute("userid");
	String passwd = (String) session.getAttribute("passwd");
	if (userid != null) {
	%>
	<h1>유저아이디는 <%= userid %></h1>
	<h1>비밀번호는 <%= passwd %></h1>
	<a href="LogoutServlet">로그아웃</a>
	<%
	} else {
	%>
	<h1>회원이 아닙니다.</h1>
	<a href="loginForm.jsp">로그인 화면으로 이동</a>
	<%
	}
	%>
</body>
</html>