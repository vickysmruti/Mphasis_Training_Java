<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Edit User</h2>

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
	<form action="/edit" method="post">
	<br><br><br>

		<label for="name">Name: </label> <input type="text" id="name"
			name="name"><br> <br> <label for="email">Email:</label>
		<input type="text" id="email" name="email"><br> <br>
		<label for="password">Password:</label> <input type="text"
			id="password" name="password"><br> <br> <input
			type="submit" value="Enter">
	</form>
	<a href="users">Back</a>

</body>
</html>