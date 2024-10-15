package com.androjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.androjava.dbconnection.ConnectionProvider;
import com.androjava.dto.UserDto;




public class UserDao {
	
	public static  int  createUser(UserDto dto) {
		Connection connection= ConnectionProvider.getConnection();
		PreparedStatement preparedStatement;
		int i=0;
		try {
		 connection= ConnectionProvider.getConnection();
	     preparedStatement = connection.prepareStatement("insert into user values(?,?,?,?)");
		preparedStatement.setString(1,dto.getName());
		preparedStatement.setString(2,dto.getEmail());
		preparedStatement.setString(3,dto.getPassword());
		preparedStatement.setString(4,dto.getMobile());
		  i = preparedStatement.executeUpdate();
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
	public static boolean loginUser(UserDto dto) {
	    Connection connection = null;
	    PreparedStatement prepareStatement = null;
	    ResultSet resultSet = null;
	    
	    try {
	        connection = ConnectionProvider.getConnection();
	        String query = "SELECT * FROM user WHERE name = ? AND email = ?";
	        prepareStatement = connection.prepareStatement(query);
	        prepareStatement.setString(1, dto.getName());
	        prepareStatement.setString(2, dto.getEmail());
	        resultSet = prepareStatement.executeQuery();
	        
	        // Check if the result set contains any record
	        if (resultSet.next()) {
	            return true;  // User found
	        } else {
	            return false; // User not found
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;  // Indicate a failure due to exception
	    } finally {
	        // Close resources in the reverse order of their opening
	        try {
	            if (resultSet != null) resultSet.close();
	            if (prepareStatement != null) prepareStatement.close();
	            if (connection != null) connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }}}
	
