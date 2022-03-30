<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FlyAway Airlines Login</title>

</head>

<body>

<form action="loginpage" method="post">

<div class="my-container">
	<div id="box1">
	<div id="header">
	<b1>Login to FlyAway Airlines</b1>
	</div>
	</div>
	</div>
	
<div id="box2">
<div id="nav">
<font size="3" weight=normal>
  <a href="index.jsp">Back to homepage</a>  <br>
  <a href="register.jsp">Register</a> <br>
  <a href="forgotpassword.jsp">Forgot Your Password</a>
</font>
</div>
</div>

<div class="my-container">	
    <div id="box3">
    <div id="login">
    <b1>
    <br><font size="4" font= arial weight= bold color=black>Please Login</font>
    <br><br>Email Address:<br><input class="textbox"type="text" name = "email" placeholder = "name@gmail.com">
    <br>
    Password:<br> <input class="textbox" type="password" name = "password" placeholder = "********"> 
    <br>
    &nbsp
    <button style="background-color:DarkSeaGreen;font:bold 16px arial;color: white;width:100;height:100"><b3>Login</b3></button> &nbsp&nbsp
    <button style="background-color:DarkSeaGreen;font:bold 16px arial;color: white;width:100;height:100"><b3>Reset</b3></button>
    </b1>
    </div>
    </div>
</div>

</form>
</body>
</html>