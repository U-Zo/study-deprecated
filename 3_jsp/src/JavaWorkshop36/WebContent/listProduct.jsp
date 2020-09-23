<%@page import="com.dto.MyProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String userid = (String) session.getAttribute("userid");
if (userid == null) {
    response.sendRedirect("error.jsp");
}

request.setCharacterEncoding("utf-8");

MyProductService service = new MyProductService();
List<MyProductDTO> list = service.select();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<script type="text/javascript">
	const delProduct = (prodId) => {
		event.preventDefault();
		location.href = 'deleteProduct.jsp?prodId=' + prodId;
	};

	const chk = (node) => {
		const deleteList = document.getElementsByName('delCheck');
		for (let deleteNode of deleteList) {
			deleteNode.checked = node.checked;
		}
	};

	const delAll = () => {
		const deleteList = document.getElementsByName('delCheck');
		let arr = [];
		for (let deleteNode of deleteList) {
			if (deleteNode.checked) { // 속성 checked을 조회 -> 
				arr.push('delCheck=' + deleteNode.value); // [] 하나씩 추가 되겠지
			}
		}
		
		location.href = 'deleteAllProduct.jsp?' + arr.join('&');
	};
</script>
</head>
<body>
	<div>로그인 아이디: <%=userid%> <a href="LogoutServlet">로그아웃</a></div>
	<form id="delForm" method="GET" action="deleteAllProduct.jsp">
		<table border="1">
			<tr>
				<th><input onchange="chk(this)" type="checkbox" id="checkAll" />전체 선택</th>
				<th>상품아이디</th>
				<th>상품명</th>
				<th>가격</th>
				<th>갯수</th>
				<th>삭제</th>
			</tr>
			<%
			for (MyProductDTO dto : list) {
			%>
				<tr>
					<td><input type="checkbox" name="delCheck" value="<%= dto.getProdId() %>" /></td>
					<td><%= dto.getProdId() %></td>
					<td><%= dto.getProdName() %></td>
					<td><%= dto.getPrice() %></td>
					<td><%= dto.getQuantity() %></td>
					<td>
						<button onclick="delProduct('<%= dto.getProdId() %>')">삭제</button>
					</td>
				</tr>
			<%
			}
			%>
		</table>
		<button>선택된 항목 삭제</button>
	</form>
</body>
</html>
