package com.mphasis.servlet;
public class Customer 
{
	private String firstName, lastName, dob, country, city, state, zip, email;
	
	public String getFirstName(){ return firstName; }
	public void setFirstName(String firstName){ this.firstName = firstName; }
	
	public String getLastName(){ return lastName; }
	public void setLastName(String lastName){ this.lastName = lastName; }
	
	public String getDob(){ return dob; }
	public void setDob(String dob){ this.dob = dob; }
	
	public String getCountry(){ return country; }
	public void setCountry(String country){ this.country = country; }
	
	public String getCity(){ return city; }
	public void setCity(String city){ this.city = city; }
	
	public String getState(){ return state; }
	public void setState(String state){ this.state = state; }
	
	public String getZip(){ return zip; }
	public void setZip(String zip){ this.zip = zip; }
	
	public String getEmail(){ return email; }
	public void setEmail(String email){ this.email = email; }
}