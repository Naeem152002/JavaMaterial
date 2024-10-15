package com.springSetterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springSetterDI.entity.Address;
import com.springSetterDI.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
         //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApllicationContext.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
         Employee bean = (Employee) applicationContext.getBean("emp");
         Address adrs = (Address) applicationContext.getBean("adr");
         System.out.println(bean.getName());
         System.out.println(adrs.getCity() + " // "+adrs.getCountry() +" // "+ adrs.getState());
        
    }
}
