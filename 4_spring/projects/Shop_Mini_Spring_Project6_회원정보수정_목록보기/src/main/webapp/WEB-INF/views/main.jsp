<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title> 
<!-- memberAdd에서 오는 success문구 받기  -->
<c:if test="${! empty success }">
	<script>
		alert('${success}')
	</script>
</c:if>
</head>
<body>
	<h1>메인화면</h1>
	<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
	<jsp:include page="common/menu.jsp" flush="true"></jsp:include><br>
	<hr>
	<jsp:include page="goods/goodsList.jsp" flush="true"></jsp:include><br>
</body>
</html>