<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Model Attribute Binding</title>
</head>
<body>

	<h1>Model Attribute from data Binding</h1>
	<form:form action="submitModelDataBinding" method="post" modelAttribute="contactInformation">
		<form:input placeholder="First Name" path="firstName" />
		<form:input placeholder="Last Name" path="lastName" />
		<input type="submit" value="Submit" />
	</form:form>	
</body>
</html>