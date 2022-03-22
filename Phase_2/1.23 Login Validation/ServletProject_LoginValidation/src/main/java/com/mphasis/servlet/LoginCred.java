package com.mphasis.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		String EmailId = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		HttpSession session=request.getSession();  
        session.setAttribute("emailid",  EmailId);
        session.setAttribute("password",  password);
		if(EmailId.equalsIgnoreCase("vicky@gmail.com")&& password.equals("vicky")){
			response.sendRedirect("dashboard");
			
		}else {
			response.sendRedirect("Login.html");
			PrintWriter out = response.getWriter();
			out.println("<span style = 'color:red'>Invalid Credentials! Please Try Again.</span>");
		}
		
		
	}

}
