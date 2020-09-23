<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원관리</title>
<script type="text/javascript">
		function deleteEmp(n){
			location.href = "EmpDeleteServlet?empno="+n;
	    	console.log("delete emp자바스크립트: "+n);
		}
</script>
</head>
<body>
<%
	EmpDTO dto=(EmpDTO)request.getAttribute("dto");
	int empno=dto.getEmpno();
	String ename=dto.getEname();
	String job=dto.getJob();
	int mgr=dto.getMgr();
	String hiredate=dto.getHiredate();
	int sal=dto.getSal();
%>
<b>[ 사원 정보 보기 ]</b>
<div style="color:red"> 직업(job)과 월급(sal) 만 수정 가능하도록 구현한다.</div>
	<form action="EmpUpdateServlet" method="post">
	  <input type="hidden" name="empno" value="<%=empno %>" ><!-- 사원 수정을 위해 hidden을 사원번호로 저장,servlet요청 시 같이 전달 -->
 		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><%=empno %></input>
				</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><%=ename %>
				</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>
				<select name="job">
				  <option value="CLERK"<%if(job.equals("CLERK")){ %>selected<%} %>>CLERK</option>
				  <option value="MANAGER" <%if(job.equals("MANAGER")){ %>selected<%} %>>MANAGER</option>
				  <option value="ANALYST" <%if(job.equals("ANALYST")){ %>selected<%} %>>ANALYST</option>
				  <option value="SALESMAN"<%if(job.equals("SALESMAN")){ %>selected<%} %> >SALESMAN</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>관리자</th>
				<td><%=mgr %>
				</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><%=hiredate %>
				</td>
			</tr>
			<tr>
				<th>월급</th>
				<td><input type="text" name="sal" value="<%=sal%>" ></input>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="사원수정"></input>
				</th>				
			</tr>

		</table>
	</form>
	<a href="EmpListServlet">목록보기</a>&nbsp;
<%-- 	<a href="EmpDeleteServlet?empno=<%=empno %>">삭제</a> --%>
	<button onclick="deleteEmp('<%=empno%>')">삭제</button>
</body>
</html>