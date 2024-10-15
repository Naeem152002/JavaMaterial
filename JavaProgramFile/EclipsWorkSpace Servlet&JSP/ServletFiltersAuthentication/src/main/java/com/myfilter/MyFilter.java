package com.myfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
       
   
   

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");  
		
		PrintWriter out=response.getWriter();  
         
		    String password=request.getParameter("password");  
		    if(password.equals("admin")){  
		    chain.doFilter(request, response);//sends request to next resource  
		    }  
		    else{  
		    out.print("username or password error!");  
		    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		    rd.include(request, response);  
		    }  
		          

	
}}
