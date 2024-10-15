package com.MyFirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
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
		System.out.println(config);
		return config;
		}  
	public String getServletInfo(){
		System.out.println("hello world");
		return "copyright 2007-1010";
		}  
	  
	}  
