<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2021111971 이재혁 Q3.jsp</title>
</head>
<body>
	<jsp:useBean id="myBean" class = "com.beantest.MyBean" scope = "request" />
	<jsp:setProperty name="myBean" property="*" />
	과목 : <jsp:getProperty name="myBean" property="lecture"/><br/>
	주제 : <jsp:getProperty name="myBean" property="subject"/><br/>
</body>
</html>