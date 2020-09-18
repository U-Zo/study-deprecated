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
	// 내장 객체 request, session, application은 import와 new 없이 사용할 수 있다.
	request.getParameter("aa"); // form 전송 데이터 파싱 관련 내장 객체
	request.setAttribute("CCC", "ccc"); // HttpServletRequest 객체에 데이터 set
	session.setAttribute("AAA", "aaa"); // HttpSession 객체에 데이터 set
	application.setAttribute("BBB", "bbb"); // ServletContext 객체에 데이터 set
	out.print("홍길동"); // DOM에 출력
	config.getInitParameter("xxx"); // ServletConfig 객체의 init-param 얻어 오기
%>
</body>
</html>