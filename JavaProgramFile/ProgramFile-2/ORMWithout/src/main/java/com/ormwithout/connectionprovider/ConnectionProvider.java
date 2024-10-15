package com.ormwithout.connectionprovider;

import java.sql.Connection;
import java.sql.DriverManager;

	public  final class ConnectionProvider 
	{
		
		private ConnectionProvider()
		{
			
		}
		
		static Connection connection=null;
		
		
		public synchronized static Connection getConnection() 
		{
			if(connection==null)
			{
				try
				{
					  Class.forName("com.mysql.cj.jdbc.Driver"); 
					  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cde","root","1234");
				}
				catch (Exception e) {
					 e.printStackTrace();
				}
				 
	         return connection;
				
			}
			else
			{
		           return connection;
					
			}
			 
		}

	}
