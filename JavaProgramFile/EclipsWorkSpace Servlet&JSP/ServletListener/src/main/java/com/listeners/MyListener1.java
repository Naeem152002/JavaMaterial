package com.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener1 implements ServletContextListener, ServletContextAttributeListener {

	ServletContext ctx;
	Connection con;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;
	int count;

	public MyListener1() {
	}

	public void contextInitialized(ServletContextEvent sce) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart", "root", "1234");
			s = con.createStatement();
			rs = s.executeQuery("select userId from user");
			while (rs.next()) {
				count = rs.getInt(1);
			}
			ctx = sce.getServletContext();
			ctx.setAttribute("userId", count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {
		try {
			ctx = sce.getServletContext();
			String name = (String) ctx.getAttribute("UserName");
			ps = con.prepareStatement("update user set UserName='" + name + "'");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		 String name = scae.getName();
	        Object value = scae.getValue();
	        System.out.println("Attribute added: " + name + " = " + value);
	
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		String name = scae.getName();
        Object value = scae.getValue();
        System.out.println("Attribute removed: " + name + " = " + value);
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		String name = scae.getName();
        Object value = scae.getValue();
        System.out.println("Attribute replaced: " + name + " = " + value);
	}

}
