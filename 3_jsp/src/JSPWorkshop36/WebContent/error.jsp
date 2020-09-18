<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid = (String) session.getAttribute("userid");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 삭제 실패</h1>
	<%
	if (userid != null) {
	%>
		삭제할 상품이 존재하지 않습니다.<br />
		<a href="listProduct.jsp">목록 보기</a>
	<%
	} else {
	%>
		잘못된 접근입니다.<br />
		<a href="loginForm.jsp">로그인 페이지</a>
	<%
	}
	%>
</body>
</html>
