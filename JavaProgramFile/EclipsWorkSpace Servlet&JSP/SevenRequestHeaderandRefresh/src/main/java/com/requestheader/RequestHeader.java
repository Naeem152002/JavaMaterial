package com.requestheader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public  void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration e=request.getHeaderNames();
		
		while(e.hasMoreElements()) {
			String name=(String)e.nextElement();
			String value=request.getHeader(name);
			out.println(name+":"+value);
			out.println("<br>");
		}
		
	}

	
	
}
