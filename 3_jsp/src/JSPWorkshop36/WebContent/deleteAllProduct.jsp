<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid = (String) session.getAttribute("userid");
if (userid == null) {
    response.sendRedirect("error.jsp");
}

request.setCharacterEncoding("utf-8");
String[] prodIds = request.getParameterValues("delCheck");

if (prodIds == null) {
    response.sendRedirect("error.jsp");
    return;
}

List<String> list = Arrays.asList(prodIds);
MyProductService service = new MyProductService();
int n = service.deleteAll(list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%
		for (String prodId : list) {
		%>
			<%= prodId %> 
		<%
		}
		%>
		상품 삭제 성공
	</h1>
	<a href="listProduct.jsp">목록 보기</a>
</body>
</html>