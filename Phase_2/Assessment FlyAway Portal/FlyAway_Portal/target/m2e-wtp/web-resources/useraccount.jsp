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
<title>Edit Your Profile</title>

</head>
<body>
<form action ="useraccount" method = "POST">
    <div class="my-container">
            
            <div id="header">
               <b1>FlyAway Airlines</b1>
            </div>
    </div>
    <div id="nav">
        Click <a href="user.jsp"> here</a> to go back to your account page <br><br>
        Click <a href="index.jsp"> here</a> to go to the FlyAway Airlines homepage
    </div>
<%
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway?user=root&password=Vicky@1996");
			Statement statement = con.createStatement();
			resultSet = statement.executeQuery("SELECT passenger.*,account.password FROM passenger INNER JOIN flyaway.account ON passenger.id = account.passenger_id WHERE passenger.id = 1");
		}
		catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(resultSet.next()){
		%>
		<div class="my-container">
		    
    		<div id="section">
    		    <b1><center><font size= "6" color= "black" family="arial"> Edit Your Profile</font></center></b1>
        		<div id="box"> <b1>
            		<input type=hidden id="cusid" name="CustId" value="<%=resultSet.getString(1)%>">
            		First Name: <br><input type="text" class="textbox" id = "FirName" name = "FirName" value="<%=resultSet.getString(2)%>"><br>
            		Last Name:<br><input type="text" class="textbox" id = "LasName" name ="LasName" value = "<%=resultSet.getString(3)%>"><br>
            		Date of Birth:<br><input type="date" class="textbox" name ="dob" value = "<%= resultSet.getDate(4) %>"><br>
            		Country:<br><input type="text" id ="Coun" class="textbox" name ="Coun" value ="<%=resultSet.getString(5)%>"><br>
            		Street Address:<br><input type="text" class="textbox" id ="StreAddr" name ="StreAddr" value ="<%=resultSet.getString(6)%>"><br>
            		City:<br><input type="text" id ="City" class="textbox" name ="City" value ="<%=resultSet.getString(7)%>"><br>
            		State:<br><input type="text" id ="Sta" class="textbox" name ="Sta" value ="<%=resultSet.getString(8)%>"><br>
            		Zip code:<br><input type="text" id ="Zip" class="textbox" name ="Zip" value ="<%=resultSet.getString(9)%>"><br>
            		Email:<br><input type ="email" id = "Email" class="textbox" name="Email" value ="<%=resultSet.getString(10)%>"><br>
        		<% }
        		%>
        		<br><input type= "submit" class="box" value="Save"></b1>
        	
        		</div>
        	</div>
		</form>

</body>
</html>