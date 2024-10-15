package com.androjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		if(session.isNew()) {
		String name=(String) session.getAttribute("name");
		String email=(String) session.getAttribute("email");
		out.println("Welcome="+name+email);
		out.println("<a href='Logout'>LogOut</a>");
		}
		else {
			response.sendRedirect("login.html");
		}
		
	}

}
