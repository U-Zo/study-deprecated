<%--
  Created by IntelliJ IDEA.
  User: KWJ
  Date: 2020-11-03
  Time: 오전 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인 화면</h1>
<form action="login" method="post">
    아이디: <input type="text" name="userid" /><br />
    비번: <input type="password" name="passwd" /><br />
    <input type="submit" value="로그인" />
</form>
<a href="main.jsp">이동하기</a>
</body>
</html>
