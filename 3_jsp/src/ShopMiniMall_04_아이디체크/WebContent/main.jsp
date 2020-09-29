<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String mesg = (String) session.getAttribute("memberAdd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style/style.css" />
</head>
<body>
	<jsp:include page="common/header.jsp"></jsp:include>
	<%
	if (mesg != null) {
	%>
		<h1><%= mesg %></h1>
	<%
	}
	%>
	<div class="responsive">
		<h1>Main 화면입니다.</h1>
	</div>
	<%-- <jsp:include page="common/top.jsp" flush="true"></jsp:include><br />
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include> --%>
</body>
</html>