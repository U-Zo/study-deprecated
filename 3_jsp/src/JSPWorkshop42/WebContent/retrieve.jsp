<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 보기</title>
</head>
<body>
	<b>[ 사원 정보 보기 ]</b>
	<div style="color: red">직업(job)과 월급(sal)만 수정 가능하도록 구현한다.</div>
	<form action="EmpUpdateServlet" method="POST">
		<input type="hidden" name="empno" value="${dto.empno}" />
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td>${dto.empno}</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td>${dto.ename}</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>
					<select name="job">
						<option value="CLERK" <c:if test="${dto.job == 'CLERK'}">selected</c:if>>CLERK</option>
						<option value="SALESMAN" <c:if test="${dto.job == 'SALESMAN'}">selected</c:if>>SALESMAN</option>
						<option value="MANAGER" <c:if test="${dto.job == 'MANAGER'}">selected</c:if>>MANAGER</option>
						<option value="ANALYST" <c:if test="${dto.job == 'ANALYST'}">selected</c:if>>ANALYST</option>
						<option value="PRESIDENT" <c:if test="${dto.job == 'PRESIDENT'}">selected</c:if>>PRESIDENT</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>관리자</th>
				<td>${dto.mgr}</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td>${dto.hiredate}</td>
			</tr>
			<tr>
				<th>월급</th>
				<td><input name="sal" value="${dto.sal}"/></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center">
					<button>사원 수정</button>
				</td>
			</tr>
		</table>
	</form>
	<a href="EmpListServlet">목록보기</a>&nbsp;
	<a href="EmpDeleteServlet">삭제</a>
</body>
</html>