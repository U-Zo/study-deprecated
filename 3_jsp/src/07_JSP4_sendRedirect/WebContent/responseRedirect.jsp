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
	request.setCharacterEncoding("utf-8"); // 한글 처리 후 데이터 파싱
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String xxx = (String) request.getAttribute("xxx");
	%>
	redirect 사용자 id: <%= userid %><br />
	redirect 패스워드: <%= passwd %><br />
	redirect attribute: <%= xxx %>
</body>
</html>