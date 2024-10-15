package com.servlerts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Emp;
import com.factoryprovider.FactoryProvider;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		Emp e=new Emp();
		e.setName("how are you");
		e.setEmail("how@gmail.com");
		
		SessionFactory sf=FactoryProvider.getSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(e);
		s.getTransaction().commit();
		out.println("Successfully");
		
	}

}
