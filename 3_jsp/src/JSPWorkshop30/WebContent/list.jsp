<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	EmpService service = new EmpService();
	List<EmpDTO> list = service.selectAllEmp();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>월급</th>
			<th>입사일</th>
			<th>부서번호</th>
		</tr>
		<%
		for (EmpDTO dto : list) {
		%>
		<tr>
			<td><%= dto.getEmpno() %></td>
			<td><%= dto.getEname() %></td>
			<td><%= dto.getSal() %></td>
			<td><%= dto.getHiredate() %></td>
			<td><%= dto.getDeptno() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>