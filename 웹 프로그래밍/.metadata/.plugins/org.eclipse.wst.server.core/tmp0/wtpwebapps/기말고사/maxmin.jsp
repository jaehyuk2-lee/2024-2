<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q3</title>
</head>
<body>
	<hr> 계산 <p>
	<%
	int x = Integer.parseInt(request.getParameter("x"));
	int y = Integer.parseInt(request.getParameter("y"));
	out.print(x+"와 "+y+" 중의 큰 수: " + Math.max(x, y));
	out.print("<br>");
	out.print(x+"와 "+y+" 중의 작은 수: " + Math.min(x, y));
	%>
	<hr>
</body>
</html>