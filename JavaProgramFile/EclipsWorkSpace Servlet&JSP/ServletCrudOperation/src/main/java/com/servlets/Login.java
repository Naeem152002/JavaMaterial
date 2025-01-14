package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.dto.Emp;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String name=request.getParameter("name");   
	        String email=request.getParameter("email");  
	        String country=request.getParameter("country"); 
	        
	        Emp e=new Emp(name,email,country);  
	        
	        boolean status=EmpDao.loginUser(e);  
				if(status){  
				    response.sendRedirect("Welcome");
				}else{  
				    out.println("Sorry! unable to save record"); 
				    request.getRequestDispatcher("login.html").include(request, response);  
				}
			
			
	}}


