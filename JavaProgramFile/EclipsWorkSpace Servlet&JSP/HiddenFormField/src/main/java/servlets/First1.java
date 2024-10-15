package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =request.getParameter("uemail");
		
		String pass= request.getParameter("upass");
		
		response.setContentType("text/html");  
  PrintWriter pw1= response.getWriter();
  pw1.println(email+" "+pass);
  
  
  // =============Session Tracking By (Hidden Form Field)Way ===============
	
	 pw1.println("<HTML><body><form action='Second'/>");
	  pw1.println("<input type='hidden' name='uemail' value='"+email+"'/>");
	  pw1.println("<input type='hidden' name='upass' value='"+pass+"'/>");
	  pw1.println("<input type='submit'>");
	  pw1.println("</form> </body> </HTML>");
	 
 
	}
}
