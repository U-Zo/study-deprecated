<%@page import="com.dto.StudentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.PageDTO"%>
<%@page import="com.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String curPage = request.getParameter("curPage");
if (curPage == null) {
    curPage = "1"; // 최초 1 설정
}

StudentService service = new StudentService();
PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage)); // 페이지 번호 전송

List<StudentDTO> list = pDTO.getList();
int perPage = pDTO.getPerPage(); // 현재 페이지 번호
int totalCount = pDTO.getTotalCount(); // 전체 목록 수
int totalPage = totalCount / perPage; // 전체 페이지 개수 계산
if (totalCount % perPage != 0) totalPage++; // 나머지 페이지 추가
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
			<th>학번</th>
			<th>이름</th>
			<th>주민번호</th>
			<th>주소</th>
			<th>입학년도</th>
			<th>휴학여부</th>
		</tr>
		<%
		for (StudentDTO dto : list) {
		%>
		<tr>
			<td><%= dto.getStuNo() %></td>
			<td><%= dto.getStuName() %></td>
			<td><%= dto.getStuSsn() %></td>
			<td><%= dto.getStuAddress() %></td>
			<td><%= dto.getEntDate() %></td>
			<td><%= dto.getAbsYn() %></td>
		</tr>
		<%
		}
		%>
		<tr>
			<td colspan="6">
			<%
				for (int i = 1; i <= totalPage; i++) {
				    if (i == Integer.parseInt(curPage)) {
			%>
						<span style="color: red;"><%= i %></span>&nbsp;&nbsp;
			<%
				    } else {
			%>
				        <a href="studentList.jsp?curPage=<%= i %>"><%= i %></a>&nbsp;&nbsp;
			<%
				    }
				}
			%>
			</td>
		</tr>
	</table>
</body>
</html>