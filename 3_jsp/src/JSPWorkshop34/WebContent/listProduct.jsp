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
        const deleteOne = (prodId) => {
          location.href = 'deleteProduct.jsp?prodId=' + prodId;
        };

        window.onload = () => {
          const deleteList = document.getElementsByName('delete');
          document
            .getElementById('checkAll')
            .addEventListener('change', function () {
            	for (let deleteNode of deleteList) {
              		deleteNode.checked = this.checked;
            	}
            });
        };
      </script>
</head>
<body>
	<div>로그인 아이디: <%=userid%> <a href="LogoutServlet">로그아웃</a></div>
	<form action="deleteAllProduct.jsp" method="GET">
		<table border="1">
			<tr>
				<th><input type="checkbox" id="checkAll" />전체 선택</th>
				<th>상품아이디</th>
				<th>상품명</th>
				<th>가격</th>
				<th>갯수</th>
				<th>삭제</th>
			</tr>
			<%
			for (MyProductDTO mp : list) {
			%>
				<tr>
					<td><input type="checkbox" name="delete" value="<%= mp.getProdId() %>" /></td>
					<td><%= mp.getProdId() %></td>
					<td><%= mp.getProdName() %></td>
					<td><%= mp.getPrice() %></td>
					<td><%= mp.getQuantity() %></td>
					<td>
						<button onclick="deleteOne('<%= mp.getProdId() %>')">삭제</button>
					</td>
				</tr>
			<%
			}
			%>
		</table>
		<button type="submit">선택된 항목 삭제</button>
	</form>
</body>
</html>
