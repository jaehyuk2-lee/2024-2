<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q4</title>
</head>
<body>
	<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null, find="", search="";
	
	find = request.getParameter("find");
	search = request.getParameter("search");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/final?serverTimezone=UTC";
		conn = DriverManager.getConnection(url,"root","0000");
		stmt = conn.createStatement();
		sql = "SELECT * FROM address_db WHERE "+ find + " LIKE '%"+search+"%';";
		rs = stmt.executeQuery(sql);
	}
	catch(Exception e) {
		out.print("DB 연동 오류입니다 : " + e.getMessage());
	}
	while(rs.next()) {
		int id = Integer.parseInt(rs.getString("Student_ID"));
		String name = rs.getString("name");
		String email = rs.getString("email");
		String address = rs.getString("Address");
		out.print(id + " " + name + " " + email + " " + address + "<br>");
	}
	%>
	
</body>
</html>