package com.requestheader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Refr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    int count=0;
    
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(getServletInfo());
		PrintWriter out=response.getWriter();
		response.setHeader("Refresh","3");
		out.println(new Date().toString()+" "+count++);
	}

	}


