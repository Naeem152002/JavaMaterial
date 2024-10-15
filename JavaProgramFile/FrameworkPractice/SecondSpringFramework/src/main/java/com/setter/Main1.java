package com.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main1 {
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext3.xml");
		Employee e=(Employee) app.getBean("employee");
	System.out.println(e.getId()+" "+e.getName());
	System.out.println(e.getAddress().get(0)+" "+e.getAddress().get(1));
	System.out.println(e.getAddres());
	System.out.println(e.getAddr());
	System.out.println(e.getAdd());
	System.out.println(e.getQuAs());
	System.out.println(e.getQa());
	}

}
