package com.servlets;
import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;

import com.oreilly.servlet.MultipartRequest;   

public class UploadServlet extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
MultipartRequest m=new MultipartRequest(request,"C:\\Users\\naeem\\OneDrive\\Desktop");  
out.print("successfully uploaded");  
}  
}  