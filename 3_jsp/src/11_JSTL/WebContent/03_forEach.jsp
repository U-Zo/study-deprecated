<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String msg = (String) request.getAttribute("yyy"); %>
	<%= msg %>
	<h1>forTokens</h1>
	<c:forTokens var="z" items="${yyy}" delims="/">
		${z}
	</c:forTokens>
	
	<h1>forEach1</h1>
	<c:forEach var="person" items="${xxx}">
		${person.username} 
		${person.age}<br />
	</c:forEach>
	
	<h1>forEach2: status</h1>
	<c:forEach var="person" items="${xxx}" varStatus="status">
		index: ${status.index}<br />
		count: ${status.count}<br />
		current: ${status.current}<br />
		first: ${status.first}<br />
		last: ${status.last}<br />
		${person.username} 
		${person.age}<br />
	</c:forEach>
	
	<h1>forEach3:range</h1>
	<c:forEach var="x" begin="1" end="10" step="2">
		${x}:world<br />
	</c:forEach>
	
	<c:forEach var="x" begin="1" end="5">
		${x}:Hello<br />
	</c:forEach>
</body>
</html>