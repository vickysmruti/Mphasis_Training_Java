<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%
	ResultSet resultSet = null;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reports</title>

</head>
<body>
<% String startDat = request.getParameter("BeginDat");
	String endDat = request.getParameter("endDat");%>
	<%Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/flyaway?user=root&password=Vicky@1996");
			String idTran;
			CallableStatement myStmt = con
					.prepareCall("{call pr_Reports(?,?)}");
			myStmt.setString(1, startDat);
			myStmt.setString(2, endDat);
			myStmt.execute();
			resultSet = myStmt.getResultSet();%>
			<h2><a href="adminpage.jsp">Home</a></h2>
			<table id="table">
			<tr>
				
				<th>Flight Name</th>
				<th>Departure Time</th>
				<th>From</th>
				<th>Arrival Time</th>
				<th>To</th>
				<th>Depature Date</th>
				<th>Arrival Date</th>
				<th></th>
				</tr>
				<%while (resultSet.next()) { %>

			<tr>
				
				<td><%= resultSet.getString(1) %></td>
				<td><%= resultSet.getString(5) %></td>
				<td><%=resultSet.getString(2) %></td>
				<td><%= resultSet.getString(4) %></td>
				<td><%= resultSet.getString(3) %></td>
				<td><%= resultSet.getString(7) %></td>
				<td><%= resultSet.getString(6) %></td>
				<td><a href="customerlist.jsp?id=<%=resultSet.getString(8)%>">Customer List</a></td>
				


			</tr>
			<%}%>
				</table>
					
</body>
</html>
