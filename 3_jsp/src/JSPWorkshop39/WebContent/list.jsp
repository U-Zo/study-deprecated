<%@page import="com.dto.PageDTO"%>
<%@page import="java.io.Console"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PageDTO pdto = (PageDTO) request.getAttribute("pdto");
	List<EmpDTO> list = pdto.getList();
	String order = (String) request.getAttribute("order");
	System.out.print(list);
	System.out.print("order check: "+order);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원관리</title>
</head>
<body>
	<b>[ 사원 목록 ]</b>
	<hr></hr>
	<%
	/* List<EmpDTO> list = (List<EmpDTO>) request.getAttribute("list"); *///자료를 꺼내옴.view의 역할.
	%>
	<table border="1">

		<!-- 검색기능 -->
		<tr>
			<td colspan="5">
				<form action="EmpSearchServlet">
					<select name="searchName">
						<option value="hiredate">입사일(년도만)</option>
						<option value="ename">이름</option>
					</select> <input type="text" name="searchValue"> <input
						type="submit" value="검색">
				</form>
			</td>
		</tr>
		<!-- 검색기능  -->
		<!-- 정렬기준 -->
		<tr>
			<th>정렬기준</th>
			<td colspan="4">
			  <form action="EmpOrderServlet">
			      월급 높은 순 : <input type="radio" name="order" value="desc" <% if("desc".equals(order)||order==null){ %>checked="checked"<%} %>/>
				 월급낮은 순 : <input type="radio" name="order" value="asc"<%if("asc".equals(order)){ %>checked="checked"<%} %>/>
				  <input type="submit" value="정렬">
               </form>
			</td>
		</tr>

		<!-- 정렬기준 -->
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직업</th>
			<th>입사일</th>
			<th>월급</th>
		</tr>
		<%
				for (int i = 0; i < list.size(); i++) {
				EmpDTO dto = list.get(i);
				int empno = dto.getEmpno();
				String ename = dto.getEname();
				String job = dto.getJob();
				String hiredate = dto.getHiredate();
				int sal = dto.getSal();
				
		%>
		<tr>
			<td><a href="EmpRetirieveServlet?empno=<%=empno%>"><%=empno%></a></td>
			<td><%=ename%></td>
			<td><%=job%></td>
			<td><%=hiredate%></td>
			<td><%=sal%></td>
		</tr>
		<%
			} //end for
		%>
		<tr>
			<td colspan="5">
			<%
				int curPage=pdto.getCurPage();
				int perPage=pdto.getPerPage();
				int totalCount=pdto.getTotalCount();
				int totalPage=totalCount/perPage;
				if(totalCount%perPage!=0)totalPage++;
				for(int i=1;i<=totalPage;i++){
					if(i==curPage){
						out.print(i+"&nbsp;");
					}else{
						out.print("<a href='EmpListServlet?curPage="+i+"'>"+i+"</a>&nbsp;");
					}
				}
					
			%>
			</td>
		</tr>
	</table>
	<a href="EmpListServlet">목록보기</a>
	<a href="EmpWriteFormServlet">사원등록</a>
</body>
</html>