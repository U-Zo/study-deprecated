<%@page import="java.util.HashMap"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String prodId = request.getParameter("prodId"); // 파싱
String quantity = request.getParameter("quantity");

MyProductService service = new MyProductService();
HashMap<String, Object> map = new HashMap<>();
map.put("prodId", prodId);
map.put("quantity", Integer.parseInt(quantity));
int n = service.updateProduct(map);
%>
