package com.androjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androjava.dao.UserDao;
import com.androjava.dbconnection.ConnectionProvider;
import com.androjava.dto.UserDto;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		UserDto dto=new UserDto(name,email,password,mobile);
		int i=	UserDao.createUser(dto);
		
		if(i>0) {
			   RequestDispatcher rd=request.getRequestDispatcher("login.html");  
		        rd.forward(request, response);  
		}
		else {
			  out.print("<h1>Data does not register !!Error</h1>");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);
		}
		
	}

}
