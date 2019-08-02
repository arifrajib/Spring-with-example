<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reading form Data</title>
</head>
<body>

	<h1>Reading contact form Data</h1>
	<p>First Name: ${firstName}</p>
	<p>Last Name: ${lastName}</p>	
	<p><a href="${pageContext.request.contextPath}">Back to main menu</a></p>
</body>
</html>