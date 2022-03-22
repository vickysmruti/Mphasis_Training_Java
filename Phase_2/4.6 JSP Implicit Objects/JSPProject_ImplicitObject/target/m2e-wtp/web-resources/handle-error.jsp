<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> An exception generated and details are as below:</h1>

<%
	exception.printStackTrace(response.getWriter());
%>
</body>
</html>