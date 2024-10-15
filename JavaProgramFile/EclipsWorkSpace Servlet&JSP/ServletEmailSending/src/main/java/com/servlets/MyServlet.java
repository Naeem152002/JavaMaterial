package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mail.Mailer;  
  
public class MyServlet extends HttpServlet {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request,  
 HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    String to=request.getParameter("to");  
    String subject=request.getParameter("subject");  
    String msg=request.getParameter("msg");  
          
    Mailer.send(to, subject, msg);  
    out.print("message has been sent successfully");  
    out.close();  
    }  
  
}  

