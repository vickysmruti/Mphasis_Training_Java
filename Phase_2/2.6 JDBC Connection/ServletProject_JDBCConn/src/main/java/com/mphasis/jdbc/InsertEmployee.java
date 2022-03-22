package com.mphasis.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertEmployee
 */
@WebServlet("/insertEmployee")
public class InsertEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployee() {
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
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		try {
			DBConnection conn = new DBConnection(dbUrl, userName, pwd);
			
			PreparedStatement stmt  = conn.getConnection().prepareStatement("insert into employee (EmpID, EmpName, Dept, Salary, Age) values (?, ?, ?, ?, ?)");
			
			stmt.setInt(1,7);
			stmt.setString(2, "Vishal");
			stmt.setString(3, "DA");
			stmt.setString(4, "90000");
			stmt.setString(5, "26");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.closeConnection();
			
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
