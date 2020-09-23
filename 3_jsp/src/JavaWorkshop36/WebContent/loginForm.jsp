<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid = (String) session.getAttribute("userid");
if (userid != null) {
    response.sendRedirect("listProduct.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="LoginServlet">
		아이디: <input type="text" name="userid"><br />
		비밀번호: <input type="text" name="passwd"><br />
		<button type="submit">로그인</button>
	</form>
</body>
</html>