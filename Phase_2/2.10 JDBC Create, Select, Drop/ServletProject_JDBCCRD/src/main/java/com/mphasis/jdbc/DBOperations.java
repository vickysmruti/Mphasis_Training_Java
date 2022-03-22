package com.mphasis.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBOperations
 */
@WebServlet("/DBOperations")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBOperations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dbUrl = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String pwd = "Vicky@1996";
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		try {
			DBConnection con = new DBConnection(dbUrl, userName, pwd);
			
			Statement st = con.getConnection().createStatement();
			
			st.executeUpdate("create database mydatabase");
			out.println("Database Created! <br>");
			st.executeUpdate("use mydatabase");
			out.println("Database Selected! <br>");
			st.executeUpdate("drop database mydatabase");
			st.close();
			out.println("Database Dropped!");
						
			con.closeConnection();
			
			out.println("</body></html>");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
		out.println("</body></html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
