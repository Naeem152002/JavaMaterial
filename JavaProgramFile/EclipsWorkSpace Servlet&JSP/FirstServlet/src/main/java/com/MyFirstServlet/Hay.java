package com.MyFirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Hay
 */
public class Hay extends GenericServlet {
	private static final long serialVersionUID = 1L;
    
    
	ServletConfig config=null;  
	  
	public void init(ServletConfig config){  
	this.config=config;  
	System.out.println("servlet is initialized");  
	}  
	  
	public void service(ServletRequest req,ServletResponse res)  
	throws IOException,ServletException{  
	  
	res.setContentType("text/html");  
	  
	PrintWriter out=res.getWriter();  
	out.print("<html><body>");  
	out.print("<b>hello simple servlet</b>");  
	out.print("</body></html>");  
	  
	System.out.println("Service");
	}  
	public void destroy()
	{
	System.out.println("servlet is destroyed");
	}  
	public ServletConfig getServletConfig()
	{
		return config;
		}  
	public String getServletInfo(){
		return "copyright 2007-1010";
		}  
	  
	}  
