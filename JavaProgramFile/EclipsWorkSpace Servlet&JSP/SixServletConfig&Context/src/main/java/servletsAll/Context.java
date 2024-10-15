package servletsAll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Context extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ServletContext ctx=getServletContext();
	
	Integer count=(Integer)ctx.getAttribute(getServletInfo());
	if(count==null) {
		count=new Integer(0);
		
	}
	count=new Integer(count.intValue()+1);
	ctx.setAttribute(getServletInfo(), count);
	out.println(count.intValue());
	
	}

	

}
