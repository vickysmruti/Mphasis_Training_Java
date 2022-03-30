<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add an Airplane</title>

</head>
<body>
<form method="post" action ="Addairplane">
<h2><a href="index.jsp">Back</a></h2>
<div>
<br><b>Airplane Name:</b><br><input class="textbox"type="text" name = "airplaneName" required><br>
<br><b>Airport:</b><br><input class="textbox"type="text" name = "airportName" required> <br>
<br><b>First Class Seats:</b><br><input class="textbox"type="text" name = "firstSeat" required> <br>
<br><b>Business Class Seats:</b><br><input class="textbox"type="text" name = "businessSeat" required> <br>
<br><b>Economy Seats:</b><br><input class="textbox"type="text" name = "economySeat" required>  <br><br>

<br><br>
<input type="submit" value="Add" class="box">

</div>
</form>
</body>
</html>