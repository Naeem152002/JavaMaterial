package com.ormwithout.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ormwithout.connectionprovider.ConnectionProvider;
import com.ormwithout.dto.Dto;

public class Dao 
{
	
public static  boolean insertData(Dto dto)
{
	try
	{
		
	Connection connection = ConnectionProvider.getConnection();
	PreparedStatement prepareStatement = connection.prepareStatement("insert into emp(id,name,address) values(?,?,?)");
	prepareStatement.setInt(1,dto.getId());
	prepareStatement.setString(2,dto.getName());
	prepareStatement.setString(3,dto.getAddress());
	
	int execute = prepareStatement.executeUpdate();
	if(execute>0)
	return true;	
	else
	return false;
	}
	catch (Exception e) 
	{
		 e.printStackTrace();
	}
	
	
	return false;
	
}
}