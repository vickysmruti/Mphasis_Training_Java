package com.mphasis.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "GenereicServletEx", urlPatterns = "/genericservlet")
public class GenericServletEx extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<html><body>");
		pw.println("Vicky Please<br>");
		pw.println(new Date());
		pw.println("</body></html>");

	}

}
