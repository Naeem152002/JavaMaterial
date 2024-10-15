package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconnection.DbConnecton;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    Connection connection;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		connection=DbConnecton.getConnection();
		String name = null;
		try {
			PreparedStatement prepareStatement = connection.prepareStatement("select name from data where email=? and pass=?");
			prepareStatement.setString(1, email);
			prepareStatement.setString(2, pass);
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			name=resultSet.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (name!=null) {
			if (request.getParameter("remember")!=null) {
				Cookie cookie1=new Cookie("email", email);
				Cookie cookie2=new Cookie("pass", pass);
				response.addCookie(cookie1);
				response.addCookie(cookie2);
			}
			else {
				
			}
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			response.getWriter().println("<a href='WelcomeServlet'>Click</a>");
		}
		else {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("LoginPage.html");
			response.getWriter().println("Invalid Details");
			requestDispatcher.include(request, response);
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
