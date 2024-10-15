package servletsAll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class One extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		 PrintWriter out= response.getWriter();
	
		
		String email = request.getParameter("uemail");
		String pass = request.getParameter("upass");
		 out.println(email);
		 out.println(pass);
		 ServletContext context=getServletContext(); 
		 
		String name1= context.getInitParameter("name");
		String uname= context.getInitParameter("username");
		String pass1= context.getInitParameter("password");
		 out.println(name1);
		 out.println(uname);
		 out.println(pass1);
		 
		 
		 ServletConfig config=getServletConfig();
         String myInit = config.getInitParameter("InitParam");
         String image=  config.getInitParameter("image");
         out.println(myInit);
         out.println(image);
//         out.println("<hrml><body background="+image+">");
		 	 
		
	}

}
