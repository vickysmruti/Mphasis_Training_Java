package com.mphasis.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCred
 */
@WebServlet("/LoginCred")
public class LoginCred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCred() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		if(username.equalsIgnoreCase("Vicky")&& password.equals("vicky")){
			rd = request.getRequestDispatcher("Success");
			rd.forward(request, response);			
		}else {
			rd = request.getRequestDispatcher("Login.html");
			PrintWriter out = response.getWriter();
			rd.include(request, response);
			out.println("<span style = 'color:red'>Invalid Credentials! Please Try Again.</span>");
		}
		
		
	}

}
