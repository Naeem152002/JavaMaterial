package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class First1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =request.getParameter("uemail");
		
		String pass= request.getParameter("upass");
		
		response.setContentType("text/html");  
  PrintWriter pw1= response.getWriter();
  pw1.println(email+" "+pass);
HttpSession session=request.getSession();
       session.setAttribute("email", email);
       session.setAttribute("pass", pass);
  
  pw1.println("<a href='Second'> Next</a>");
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}
}
