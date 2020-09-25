<%@page import="java.util.HashMap"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="com.service.EmpService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String prodId = request.getParameter("prodId");
    String quantity = request.getParameter("quantity");
    
     EmpService service = new EmpService();
     HashMap<String,Object> map = new HashMap<>();
     map.put("prodId", prodId );
     map.put("quantity", Integer.parseInt(quantity) );
     int n = service.updateProduct(map);
%>    
