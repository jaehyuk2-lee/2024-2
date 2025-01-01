<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2021111971 이재혁 test1.jsp</title>
</head>
<body>
	<c:set var="name" value="홍길동"/>
	선언하고 이름 출력 : <c:out value="${name}"/><br/>
	
	<c:set var="name" value="철수"/>
	변경하고 이름 출력 : <c:out value="${name}"/><br/>
	
	<c:remove var="name" />
	삭제하고 이름 출력 : <c:out value="${name}" default="이름없음"/><br/>
	
	<c:forEach var="x" begin="1" end="5">
		<font size="${x}">안녕하세요</font>
	</c:forEach>

	<c:set var="num1" value="5"/>
	<c:set var="num2" value="2"/>
	<c:if test="${num1>num2}">
		큰수 : ${num1}
	</c:if>
	<c:if test="${num1<num2}">
		큰수 : ${num2}
	</c:if>
</body>
</html>