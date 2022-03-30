package com.mphasis.servlet;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddairplaneServlet
 */
@WebServlet("/Addairplane")
public class AddairplaneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddairplaneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String airplaneName = request.getParameter("airplaneName");
		String airportName = request.getParameter("airportName");
		int firstSeat = Integer.parseInt(request.getParameter("firstSeat"));
		int businessSeat = Integer.parseInt(request
				.getParameter("businessSeat"));
		int economySeat = Integer.parseInt(request.getParameter("economySeat"));
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/flyaway?user=root&password=Vicky@1996");

			CallableStatement myStmt = con.prepareCall("{call pr_NewAirplane(?,?,?,?,?,?,?,?,?)}");
			myStmt.setString(1, airportName);
			myStmt.setString(2, airplaneName);
			myStmt.setInt(3, firstSeat);
			myStmt.setInt(4, businessSeat);
			myStmt.setInt(5, economySeat);
			myStmt.execute();

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/flightlist.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
