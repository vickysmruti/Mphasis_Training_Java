package com.mphasis.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBTableOperations
 */
@WebServlet("/DBTableOperations")
public class DBTableOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBTableOperations() {
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
			
			Statement stmt = conn.getConnection().createStatement();
			
			stmt.executeUpdate("insert into employee (EmpID, EmpName, Dept, Salary, Age) values (8, 'Praj', 'Govt', '40000', '25')");
			out.println("Row Inserted! <br>");
			stmt.executeUpdate("update employee set Salary='50000' where EmpName='Praj'");
			out.println("Row Updated! <br>");
			stmt.executeUpdate("delete from employee where EmpName='Praj'");
			out.println("Row Deleted!");
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
