<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAP</title>
</head>
<body>
<%
HashMap<String,String> a = new HashMap<String, String>();
a.put("Location", "보스턴");
a.put("Road", "오하이오");
a.put("Age", "2x");
request.setAttribute("Map", a);

RequestDispatcher rd = request.getRequestDispatcher("MAP_output.jsp");
rd.forward(request, response);
%>
</body>
</html>