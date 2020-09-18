<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 디렉티브 태그 import, jsp 선언, 처음 줄에 주로 사용 -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
</head>
<body>
	<h1>JSP 기본 실습</h1>
	hello !!<br />
	안녕하세요
	<% // servlet의 doGet() 메서드
	System.out.println("Hello"); // 콘솔에 출력
	out.print("tst"); // 브라우저에 응답으로 출력
	int age = 20;
	%>
	<%= age %> <!-- out.print(age)와 동일 -->
</body>
</html>
