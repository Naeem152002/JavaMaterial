package com.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	  
	  
	public class Demo extends HttpServlet {
		private static final long serialVersionUID = 1L;
	  
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(n.equals("Naeem")){  
	       // RequestDispatcher rd=request.getRequestDispatcher("Demo2");  
	       // rd.forward(request, response);  
	    	response.sendRedirect("Demo2");
	    }  
	    
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	        rd.include(request, response);  
	                      
	        }  
	    }  
	  
	}  
