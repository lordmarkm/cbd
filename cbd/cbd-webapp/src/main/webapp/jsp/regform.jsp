<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form commandName="regForm" action="/cbd-webapp/register/save/">
<ol>
	<li>
		<form:label path="displayName">Display name</form:label>
		<form:input path="displayName" />
	</li>
	<li>
		<form:label path="password">Password</form:label>
		<form:password path="password" />
	</li>
	<li>
		<form:label path="memberType">Member Type</form:label>
		<form:select path="memberType" items="${memberTypes }" />
	</li>
	<li>
		<form:label path="firstName">First name</form:label>
		<form:input path="firstName" />
	</li>
	<li>
		<form:label path="lastName">Last name</form:label>
		<form:input path="lastName" />
	</li>
	<li>
		<input type="submit" />
	</li>
</ol>
<form:hidden path="userAccount.userId" />
<form:hidden path="userInfo.userId" />
</form:form>

<%@include file="links.jsp" %>
</body>
</html>