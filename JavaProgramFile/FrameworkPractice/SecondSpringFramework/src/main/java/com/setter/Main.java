package com.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext3.xml");
		Employee e=(Employee) app.getBean("employee");
	e.show();
	}

}
