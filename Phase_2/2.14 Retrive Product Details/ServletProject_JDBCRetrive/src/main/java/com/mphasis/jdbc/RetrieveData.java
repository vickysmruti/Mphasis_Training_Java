package com.mphasis.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
		
		int id = Integer.parseInt(request.getParameter("EmpID"));
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		try {
			DBConnection con = new DBConnection(dbUrl, userName, pwd);
			
			Statement st = con.getConnection().createStatement();
			
//			Scanner sc = new Scanner(System.in);
//			int id = sc.nextInt();
			
			st.executeQuery("select * from employee where EmpID ="+id);
			
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
