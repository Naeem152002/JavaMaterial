package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First1 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =request.getParameter("uemail");
		
		String pass= request.getParameter("upass");
		
		response.setContentType("text/html");  
  PrintWriter pw1= response.getWriter();
  pw1.println(email+" "+pass);
  
	
  
  
  pw1.println("<a href='Second?uemail="+email+"&upass="+pass+"'> Next</a>");
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*
	 *RequestDispatcher KE THROW BHI HUM SAME dATA KO NEXT SERVLET PR LE JA SAKTE H
	 *BUT ONLY SINGLE REQUEST HI JAYEGI 
	 * RequestDispatcher rd=request.getRequestDispatcher("Second");
	 * rd.forward(request, response);
	 */
  
 // pw1.println("<a href='Second'> Next</a>");
  
  
  // =============Session Tracking By (Hidden Form Field)Way ===============
	/*
	 * pw1.println("<HTML><body><form action='Second'  method='get'/>");
	 * pw1.println("<input type='hidden' name='uemail' value='"+email+"'/>");
	 * pw1.println("<input type='hidden' name='upass' value='"+pass+"'/>");
	 * pw1.println("<input type='submit'>"); pw1.println("</form> </body> </HTML>");
	 */
 
  
  //========================URL Rewrite Way ========================
  //pw1.println("<a href='Second?uemail="+email+"&upass="+pass+"'>NextServlet</a>");  
//?uemail=akashkumar25258%40gmail.com&upass=321654 
	}
}
