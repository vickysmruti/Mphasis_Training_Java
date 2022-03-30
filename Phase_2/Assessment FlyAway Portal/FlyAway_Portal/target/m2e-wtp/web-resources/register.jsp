<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register page</title>
    
    
</head>

<body>
	<form method="post">
		<div class="my-container">
            
        </div>
		
		<div id="nav">
		    <b4>Back to FlyAway Airlines Homepage </b4><a href="index.jsp">here</a>
		    <br><b4> Registered already please login </b4> <a href="login.jsp">here</a>
        </div>
        
        <div class="my-container">
            
            <div id="section">
                <b1><b7><center>Join FlyAway</center></b7>
        
        		<br><hr size=1px color=ForestGreen></hr>
        
        		<b4>Name</b4>
        
        		<b5>(* required) <br>Use your name as it appears on a government-issued ID. We are also
        		asking for your gender and date of birth.</b5> <br>
        		
        		<b6>Title</b6><br> 
        		<select>
        			<option value="title" selected>Select Title</option>
        			<option value="Mr.">Mr.</option>
        			<option value="Mrs.">Mrs.</option>
        			<option value="Ms.">Ms.</option>
        			<option value="Miss">Miss</option>
        			<option value="Dr.">Dr.</option>
        			<option value="Master">Master</option>
        		</select> <br>
        		
        		<table border="0">      
        			<tr> 
        				<td><b6>First Name*</b6></td>
        				<td><b6>Middle Name</b6></td>
        				<td><b6>Last Name*</b6></td>
        				
        			</tr>
        			<tr>
        				<td><input type="text" name="first name"></td>
        				<td><input type="text" name="middle name"></td>
        				<td><input type="text" name="last name"></td>
        				
        			</tr>
        			<tr>
        				<td><b6>Date of Birth*</b6></td>
        				<td><b6>Gender*</b6></td>
        			</tr>
        			<tr>
        				<td><input type="date" name="Date of Birth"></td>
        				<td><select><option value="gender" selected>Select</option>
        						<option value="Female">Female</option>
        				</select></td>
        			</tr>
        		</table>
        		
        		<hr size=1px color=ForestGreen></hr>

        		<b4> Address </b4>	<br>
                <table border="0">
        			<tr>
        				<td><b6>Country*</b6></td>
        				<td><b6>Address*</b6></td>
        			</tr>
        			<tr>
        				<td><input type="text" name="country"
        					placeholder="India"></td>
        				<td><input type="text" name="address"></td>
        			</tr>
        			<tr>
        				<td><b6>City*</b6></td>
        				<td><b6>State*</b6></td>
        				<td><b6>Postal Code*</b6></td>
        			</tr>      
        			<tr>
        			    <td><input type="text" name="city"></td> 
        				<td><select><option value="state" selected>Select</option>
        						<option value="DL">Delhi</option>
        						<option value="MB">Mumbai</option>
        						<option value="BL">Bangalore</option>
        						<option value="CH">Chennai</option>
        						<option value="HD">Hyderabad</option>
        						<option value="KL">Kolkata</option>
        						<option value="AH">Ahemadabad</option>
        						<option value="ND">Noida</option>
        						<option value="JK">Jammu&Kashmir</option>
        						<option value="BS">Bhubaneswar</option>
        						<option value="VZ">Vizag</option>
        						<option value="CC">Cochi</option>
        						<option value="GO">Goa</option>
        						<option value="PN">Pune</option>
        						<option value="IN">Indore</option>
        						<option value="AS">Assam</option>
        						
        						
        				</select></td>      
        				<td><input type="text" name="postal code"></td>
        		</table>
        		<hr size=1px color=ForestGreen></hr>
        		
        		<b4> Email </b4><br>
                <table border="0">
        			<tr>
        				<td><b6>Primary Email*</b6></td>
        				<td><b6>Confirm Primary Email*</b6></td>
        			</tr>
        			<tr>
        				<td><input type="text" name="primary email"></td>
        				<td><input type="text" name="confirm primary email"></td>
        			</tr>
        		</table>
        		
        		<hr size=1px color=ForestGreen></hr>
       
        		<b4>Account</b4><br>

        		<table border="0">
        			<tr>      
        				<td><b6>Username*</b6></td>    
        				<td><b6>Password*</b6></td> 
        				<td><b6>Confirm Password*</b6></td>
        			</tr>
        			<tr>
        				<td><input type="text" name="username:"></td>
        				<td><input type="text" name="password:"></td>
        				<td><input type="text" name="confirm password:"></td>
        			</tr>
        		</table>
        
        		<hr size=1px color=ForestGreen></hr>

        		<b6>
        			<input type="checkbox" name="agreement:"> I agree to the
        			FlyAway terms/conditions and private policy <br>
        			<p style="text-align:center"><input type="submit" value="Register"></p>
        		</b6>
        		</b1>
    		</div>
    	</div>
    </form>
</body>
</html>