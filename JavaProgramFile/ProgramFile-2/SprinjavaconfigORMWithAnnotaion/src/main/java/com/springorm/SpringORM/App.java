package com.springorm.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springorm.SpringORM.entities.User;
import com.springorm.SpringORM.javaconfig.JavaConfig;
import com.springorm.SpringORM.userdao.UserDao;

public class App 
{
    public static void main( String[] args )
    
    {
    	   ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(JavaConfig.class);
           
           UserDao userDao =applicationContext.getBean("userDao" ,UserDao.class);
          
          User user=new User(2,"rajaa","agra");
          userDao.insert(user);
          
          
   
           }   	   
           }


