package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Second extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		  PrintWriter out= response.getWriter();
		 response.setContentType("text/html");  
         
			String email =request.getParameter("uemail");
			
			String pass= request.getParameter("upass");
			
	  out.println(email+" "+pass);
	  
		
  
        
	}

}


