package com.myfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
	FilterConfig config;  
	  
	public void init(FilterConfig config) throws ServletException {  
	    this.config=config;  
	}  

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");  
		 PrintWriter out=response.getWriter();  
         
		    String s=config.getInitParameter("construction");  
		          
		    if(s.equals("yes")){  
		         out.print("This page is under construction");  
		    }  
		    else{  
		         chain.doFilter(request, response);//sends request to next resource  
		    }  
		          
		}  }
