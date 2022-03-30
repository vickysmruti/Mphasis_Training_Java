package com.mphasis.servlet;
import java.sql.*;
public class InsertPassenger
{
	public static int insertPassenger(Passenger p)
	{
		int status = 0;
		try
		{
			String passengerTable = "INSERT INTO Passenger"
									+ "(Customer_idCustomer, firstName, lastName, dob)"
									+ " VALUES (?,?,?,?)";
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement(passengerTable);
			ps.setLong(1,p.getCustID());
			ps.setString(2,p.getFirstName());
			ps.setString(3,p.getLastName());
			ps.setString(4,p.getDob());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}