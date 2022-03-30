<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%
	ResultSet resultset = null;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight List</title>

</head>
<body>
<form>

<% 
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/flyaway?user=root&password=Vicky@1996");
	Statement statement = con.createStatement();
	resultset = statement.executeQuery("SELECT airplane.*, airport.city FROM airplane INNER JOIN airport on airplane.id = Airport.id;");%>
	<table id="table">
	<tr>
		<th></th>
		<th>Flight</th>
		<th>City</th>
		<th>First Class seats</th>
		<th>Business Class seats</th>
		<th>Economy seats</th>

	</tr>
	<%while (resultset.next()) { %>

	<tr>
		
		<td><%= resultset.getString(1) %></td>
		<td><a href="editflight.jsp?id=<%=resultset.getString(9)%>"><%= resultset.getString(9) %></a></td>
		<td><%= resultset.getString(11) %></td>
		<td><%=resultset.getString(2) %></td>
		<td><%= resultset.getString(3) %></td>
		<td><%= resultset.getString(4) %></td>
		<%if(((Number) resultset.getObject(5)).intValue() == 1)
		{%>
		<td>YES </td>
		<%}
		else
		{%>
		<td>NO </td>
		<%}%>
		<%if(((Number) resultset.getObject(6)).intValue() == 1)
		{%>
		<td>YES </td>
		<%}
		else
		{%>
		<td>NO </td>
		<%}%>
		<%if(((Number) resultset.getObject(7)).intValue() == 1)
		{%>
		<td>YES </td>
		<%}
		else
		{%>


	</tr>
	<%}%>
</TABLE>
	<%}
	 catch (Exception e)
		 { // TODO Auto-generated catch block
				e.printStackTrace();
		 }
		%>
	</form>
</body>
</html>