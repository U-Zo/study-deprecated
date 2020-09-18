<%@page import="com.dto.EmpDTO"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
EmpService service = new EmpService();

int empno = Integer.parseInt(request.getParameter("empno"));
String ename = request.getParameter("ename");
String job = request.getParameter("job");
int mgr = Integer.parseInt(request.getParameter("mgr"));
String hiredate = null;
int sal = Integer.parseInt(request.getParameter("sal"));
int comm = 0;
int deptno = 0;

EmpDTO emp = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
int n = service.insertEmp(emp);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (n == 0) {
	%>
		<h1>사원 등록 실패</h1>
		<a href="member.html">사원 등록 페이지</a>
	<%
	} else {
	%>
		<h1>사원 등록 성공</h1>
		<a href="list.jsp">목록보기</a>
	<%
	}
	%>
</body>
</html>