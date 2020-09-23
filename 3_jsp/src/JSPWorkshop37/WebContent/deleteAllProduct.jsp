<%@page import="com.service.MyProductService"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String [] prodIds = request.getParameterValues("delCheck");
	List<String> x = Arrays.asList(prodIds);
	MyProductService service = new MyProductService();
	int n = service.deleteAll(x);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	for (String prodId : x) {
	%>
		<%= prodId %> 
	<%
	}
	if (n != 0) {
	%>
		상품 삭제 성공
	<%
	}
	else {
	%>
		상품 삭제 실패
	<%
	}
	%>
	<br />
	<a href="listProduct.jsp">목록보기</a>
</body>
</html>