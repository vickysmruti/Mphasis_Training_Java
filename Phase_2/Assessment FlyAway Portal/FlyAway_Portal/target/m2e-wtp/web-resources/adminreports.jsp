<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%@ page import ="java.sql.CallableStatement.*"%>
<%@ page import ="java.sql.Connection.*"%>
<%@ page import ="java.sql.DriverManager.*"%>

<%
	ResultSet resultSet = null;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reports</title>

</head>
<body>
		
<form action ="adminreportresults.jsp">
		<div>
        <b>Enter in the dates to search flights for:</b><br><br><br>
		<label><b>Start Date:</b></label>
		<input type ="date" name ="BeginDat"><br>
		<label><b>End Date:&nbsp&nbsp</b></label>
		<input type ="date" name ="endDat"><br><br>
		
		<input type="submit" value="Show flights" class="box">
		
		
		</div>
</form>
</body>
</html>