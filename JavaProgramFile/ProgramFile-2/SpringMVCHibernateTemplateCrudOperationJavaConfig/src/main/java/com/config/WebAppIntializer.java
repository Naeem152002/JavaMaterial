package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppIntializer  implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
	context.register(JavaConfig.class,WebConfig.class);
	context.setServletContext(servletContext);
	
	ServletRegistration.Dynamic dispatcher=servletContext.addServlet("dispatcher", new DispatcherServlet(context));
	dispatcher.setLoadOnStartup(1);
	dispatcher.addMapping("/");
	
	}

}
