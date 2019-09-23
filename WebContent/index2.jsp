<%@page import="java.util.ArrayList"%>
<%@page import="dynamicProjj2.CenterDTO"%>
<%@page import="dynamicProjj2.CenterDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>하일 갓동규</h1>

<%
ArrayList<CenterDTO> dto = new CenterDAO().list("qna");


for(CenterDTO dt : dto){

%>
<%=dt.getContent() %><br>
<%=dt.getCate() %><br>
<%=dt.getPname() %><br>
<%} %>
</body>
</html>