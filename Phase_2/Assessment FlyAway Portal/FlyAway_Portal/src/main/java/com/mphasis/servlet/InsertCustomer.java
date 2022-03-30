package com.mphasis.servlet;
import java.sql.*;

public class InsertCustomer 
{
	public static int insertCust(Customer c)
	{
		int status = 0;
		try
		{
			String customerTable = "INSERT INTO Customer"
									+ "(firstName, lastName, dob, country, city, state, zip, email)"
									+ " VALUES (?,?,?,?,?,?,?,?)";
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement(customerTable);
			ps.setString(1,c.getFirstName());
			ps.setString(2,c.getLastName());
			ps.setString(3,c.getDob());
			ps.setString(4,c.getCountry());
			ps.setString(5,c.getCity());
			ps.setString(6,c.getState());
			ps.setString(7,c.getZip());
			ps.setString(8,c.getEmail());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}