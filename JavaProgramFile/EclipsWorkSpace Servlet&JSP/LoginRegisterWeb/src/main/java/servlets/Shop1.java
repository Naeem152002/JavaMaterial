package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Shop1
 */
public class Shop1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("<html> <body>");
		writer.println("<h1>Mobiles</h1> <br> <form action='Checkout'> IPhone<input type='checkbox' name='IPhone'> <br> Oppo-Mobile<input type='checkbox' name='Oppo-Mobile'> <br> Vivo-Mobile<input type='checkbox' name='Vivo-Mobile'> <br> <input type='submit' value='Add to cart'></form>");
		writer.println("</body> </html>");
	}
}
