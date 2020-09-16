<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% // servlet의 doget 부분 코드 구현
        String mesg = (String) request.getAttribute("request"); //request객체
        String mesg2 = (String) session.getAttribute("session"); //session객체
        String mesg3 = (String) application.getAttribute("application"); //context객체
    %>
    request>>>><%=mesg%><br /> <!-- 화면에 변수 출력 out.print(mesg) -->
    session>>>><%=mesg2%><br />
    context(application)>>>><%=mesg3%><br />
    hello~~
</body>
</html>