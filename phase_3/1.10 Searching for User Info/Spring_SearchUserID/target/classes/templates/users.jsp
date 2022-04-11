<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

<h2>Users</h2>

	<table style="float: left">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<c:forEach items="${users}" var="user" varStatus="count">
			<tr id="${count.index}">
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
			</tr>
		</c:forEach>
	</table>

	<form action="/users" method="post">
	
	<br><br><br><br><br><br><br><br><br><br>
		<label for="id">ID:</label> <input type="text" id="id" name="id"><br>
		<br>

		<input type="submit" value="Enter">
	</form>


</body>
</html>