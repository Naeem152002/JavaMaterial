package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Second extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		  PrintWriter out= response.getWriter();
		 response.setContentType("text/html");  
         
         
  
        Cookie cookie[]= request.getCookies();
        
        for(int i=0;i<cookie.length;i++)
        {
        	out.println( cookie[i].getName()+" "+ cookie[i].getValue());  
        	
        }
	}

}


