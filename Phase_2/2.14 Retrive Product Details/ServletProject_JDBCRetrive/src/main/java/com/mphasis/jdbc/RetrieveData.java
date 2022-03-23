package com.mphasis.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveData
 */
@WebServlet("/RetrieveData")
public class RetrieveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/vickydb";
		String userName = "root";
		String pwd = "Vicky@1996";
		
		response.setContentType ("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("EmpID");
		
		try {
			DBConnection con = new DBConnection(dbUrl, userName, pwd);

			PreparedStatement ps = con.getConnection().prepareStatement("select * from employee where EmpID=?");
			ps.setString (1, id);
	        out.print ("<table width=50% border=1>");
	        out.print ("<caption>Employee Details:</caption>");
	        ResultSet rs = ps.executeQuery();
	        
	        out.print ("</br></br>");
	        ResultSetMetaData rsmd = rs.getMetaData ();
	        int total = rsmd.getColumnCount ();
	        out.print ("<tr>");
	        for (int i = 1; i <= total; i++){
	             out.print ("<th>" + rsmd.getColumnName (i) + "</th>");
	         }
	         out.print ("</tr>");
	         while (rs.next ())
	         {
	             out.print ("<tr><td>" + rs.getInt (1) + "</td><td>" +  rs.getString (2) + " </td><td>" + rs.getString (3) + "</td></tr>"  + rs.getString (4)+ " </td><td>" + rs.getString (5)+" </td><td>");
	         }
	         out.print ("</table>");
	    }catch (Exception e2)
	        {
	            e2.printStackTrace ();
	        }
	     finally
	        {
	            out.close ();
	        }
	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
