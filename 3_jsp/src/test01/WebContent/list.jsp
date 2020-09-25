<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
EmpService service = new EmpService();
List<EmpDTO> list = service.select();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>[ 권 준 ]</b>
	<hr />
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직업</th>
			<th>입사일</th>
			<th>월급</th>
		</tr>
		<%
		for (EmpDTO dto : list) {
		%>
			<tr>
				<td>
					<%= dto.getEmpno() %>
				</td>
				<td>
					<%= dto.getEname() %>
				</td>
				<td>
					<%= dto.getJob() %>
				</td>
				<td>
					<%= dto.getHiredate() %>
				</td>
				<td>
					<%= dto.getSal() %>
				</td>
			</tr>
		<%
		}
		%>
	</table>
	<a href="">사원등록</a>
</body>
</html>