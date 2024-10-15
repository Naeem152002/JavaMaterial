package com.fourthhibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerceproject.factoryprovider.FactoryProvider;
import com.fourthhiberante.emp.Emp;


/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public  void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//out.println("<h1>Successfully<h1>");
	
		try{
			String name=request.getParameter("name");	
String email=request.getParameter("email");	
String password=request.getParameter("password");	
	String mobile=request.getParameter("mobile");	
	Emp e=new Emp(name,email,password,mobile);
	System.out.println(e);
		
	SessionFactory sessionFactory=FactoryProvider.getFactory();
	System.out.println(sessionFactory);
	Session session=sessionFactory.openSession();
	session.beginTransaction();
   session.save(e);
	session.getTransaction().commit();
	session.close();
	
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
}


		
	}
		


