package com.myfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
       
   
    public MyFilter() {
        super();
       
    }

	public void destroy() {
		System.out.println("Filter destory");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
		
	     out.println("do filter1 before");
		chain.doFilter(request, response);
		out.println("do filter1 after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init");
	}

}
