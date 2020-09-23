<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String prodId = request.getParameter("prodId");
MyProductService service = new MyProductService();
int n = service.delete(prodId);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (n != 0) {
	%>
		<h1><%= prodId %> 상품 삭제 성공</h1>
		<a href="listProduct.jsp">목록 보기</a>
	<%
	} else {
	%>
		<h1>상품 삭제 실패</h1>
		<a href="listProduct.jsp">목록 보기</a>
	<%
	}
	%>
</body>
</html>