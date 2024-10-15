package com.androjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.androjava.dao.UserDao;
import com.androjava.dto.UserDto;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		UserDto dto=new UserDto(name,email);
		boolean check=	UserDao.loginUser(dto);
		
		if(check) {
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("email", email);
			  RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
		        rd.forward(request, response);  
		}	
		else {
			out.print("<h1>Data does not Retrive !!Error</h1>");  
	        RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	        rd.include(request, response);
			
		}
		
		
	}

}
