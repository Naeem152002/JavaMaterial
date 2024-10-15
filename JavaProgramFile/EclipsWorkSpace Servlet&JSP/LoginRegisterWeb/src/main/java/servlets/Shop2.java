package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Shop2
 */
public class Shop2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.println("<html> <body>");
		writer.println("<h1>Laptops</h1> <br> <form action='Checkout'> MacBook<input type='checkbox' name='MacBook'> <br> Hp-Laptop Mobile<input type='checkbox' name='Hp-Laptop'> <br> Dell-Laptop<input type='checkbox' name='Dell-Laptop'> <br> <input type='submit' value='Add to cart'></form>");
		writer.println("</body> </html>");
	}

}
