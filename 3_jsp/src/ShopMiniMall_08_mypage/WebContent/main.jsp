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
	String mesg = (String) session.getAttribute("memberAdd");
	if (mesg != null) {
	%>
		<h1><%= mesg %></h1>
	<%
	}
	%>
	<jsp:include page="common/top.jsp" flush="true"></jsp:include>
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
    <hr />
    <jsp:include page="goods/goodsList.jsp" flush="true"></jsp:include>
</body>
</html>