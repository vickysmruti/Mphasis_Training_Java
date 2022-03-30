<%-- 
    Document   : index
    Created on : Apr 8, 2015, 4:31:00 PM
    Author     : matthewliming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seat Page</title>
		
    </head>
    <header>
	<h1 style="background-color: #A7C942; color: white">Seat Selection</h1>
	</header>
	<input type="hidden" id="totPass">
	<div>
	
	<% 
		int i = 0;
String classType = "";
String SeatUnavailColor = "red";
String SeatAvailColor = "aqua";
String seatColor = "";
int seatTyp;
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway?user=root&password=Vicky@1996");
		statement = connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM seat where id = 1");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		while(resultSet.next()) {
			
			seatTyp = resultSet.getInt(4);
			if(seatTyp == 1) {
				seatColor = SeatAvailColor;
			}
		else {
				seatColor = SeatUnavailColor;
			}	
	%>
	<script type='text/javascript'>
		 
	document.getElementById('totPass').value = 2;   
	var curPass = 0;
	function changeColor(name) {
		    var but;
            var totalPassengers = document.getElementById('totPass').value;
			but = document.getElementById(name);
			if(curPass < totalPassengers) { 
				if(but.style.backgroundColor == "aqua")
				{
					but.style.backgroundColor = "green";
					curPass = curPass + 1;
				}			
				else if(but.style.backgroundColor == "green")
				{
				but.style.backgroundColor = "aqua";
				curPass = curPass - 1;
			    }
			}
		}
	
	  
      </script>
    <body>
        
		<input type ="button" style="background-color: <%=seatColor%>"  id = "<%=resultSet.getString(1)%>" name =  "<%=resultSet.getString(1)%>" value = " " class = "startPt" onclick = "changeColor(<%=resultSet.getString(1)%>)">
		
		
		
		
		<% } %>
		
		<br>
		<br>
		
		<input type ="Submit" value = "Continue" name="Continue" class ="skipBut" >
		</div>
		
		<footer>
		<h1></h1><input type ="button" style="background-color: aqua"> Available 
		&nbsp
		<input type ="button" style="background-color: red"> UnAvailable
		&nbsp
		<input type ="button" style="background-color: green"> Selected</h1>
		&nbsp
		<br><br>
		</footer>
		
    </body>
</html>