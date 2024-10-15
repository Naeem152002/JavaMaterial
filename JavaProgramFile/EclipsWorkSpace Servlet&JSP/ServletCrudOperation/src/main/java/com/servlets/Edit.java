package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.EmpDao;
import com.dto.Emp;   

public class Edit extends HttpServlet {  
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        out.println("<h1>Update Employee</h1>"); 

        int id = Integer.parseInt(request.getParameter("id"));  
        Emp e = EmpDao.getEmployeeById(id);
        System.out.println(e);

//        if (e==null ) {
//            out.print("<form action='Edit2' method='post'>");  
//            out.print("<table>");  
//            out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
//            out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
//            out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+e.getPassword()+"'/>  </td></tr>");  
//            out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");  
//            out.print("<tr><td>Country:</td><td>");  
//            out.print("<select name='country' style='width:150px'>");  
//            out.print("<option>India</option>");  
//            out.print("<option>USA</option>");  
//            out.print("<option>UK</option>");  
//            out.print("<option>Other</option>");  
//            out.print("</select>");  
//            out.print("</td></tr>");  
//            out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
//            out.print("</table>");  
//            out.print("</form>");  
//        } else {
//            out.print("<h2>No Employee found with ID " + id + "</h2>");
//        }
    }  
}  
