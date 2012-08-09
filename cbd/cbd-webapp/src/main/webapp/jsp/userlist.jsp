<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
	<c:forEach items="${users }" var="user">
		<li>
			<a href="/cbd-webapp/view/${user.userId}">${user.displayName } - ${user.userInfo.lastName }, ${user.userInfo.firstName } (${user.memberType })</a>
			<br/>
			<a href="/cbd-webapp/register/edit/${user.userId }">Edit</a>
			<a href="/cbd-webapp/register/delete/${user.userId }">Delete</a>
		</li>
	</c:forEach>
	</ol>
	
	<%@include file="links.jsp" %>
</body>
</html>