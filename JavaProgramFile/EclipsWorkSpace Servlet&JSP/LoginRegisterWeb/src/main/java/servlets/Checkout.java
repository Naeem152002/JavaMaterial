package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Checkout
 */
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Your Cart</h1>");
		Enumeration<String> parameterNames = request.getParameterNames();
		HttpSession session = request.getSession();
		while (parameterNames.hasMoreElements()) {
			String string = (String) parameterNames.nextElement();
			session.setAttribute(string, string);
//			writer.println(string);
//			writer.println("<br>");
		}
		int i=1;
		Enumeration<String> attributeNames = session.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String string = (String) attributeNames.nextElement();
			writer.println(i++ +". "+ string);
			writer.println("<br>");
		}
	
	}

}
