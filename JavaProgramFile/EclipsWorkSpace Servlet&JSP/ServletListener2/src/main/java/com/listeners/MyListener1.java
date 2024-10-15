package com.listeners;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener1
 *
 */
public class MyListener1 implements HttpSessionListener {

ServletContext ctx=null;  
static int total=0,current=0;  
  
    public MyListener1() {
        // TODO Auto-generated constructor stub
    }
  
public void sessionCreated(HttpSessionEvent e) {  
total++;  
current++;  
  
ctx=e.getSession().getServletContext();  
ctx.setAttribute("totalusers", total);  
ctx.setAttribute("currentusers", current);  
  
}  

public void sessionDestroyed(HttpSessionEvent e) {  
    current--;  
    ctx.setAttribute("currentusers",current);  
}  

}  