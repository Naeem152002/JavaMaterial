package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.DbConnecton;
import dto.Dto;

public class UserDao {
	public int registerDao(Dto dto) {
		int executeUpdate = 0;
		Connection con= DbConnecton.getConnection();
		PreparedStatement preparedStatement;
		try {
		preparedStatement = con.prepareStatement("insert into data values(?,?,?,?)");
		preparedStatement.setString(1,dto.getName());
		preparedStatement.setString(2,dto.getEmail());
		preparedStatement.setString(3,dto.getMobile());
		preparedStatement.setString(4,dto.getPass());
		executeUpdate = preparedStatement.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return executeUpdate;
	}
	public String loginDao(Dto dto) {
		String name = null;
		try {
			Connection connection=DbConnecton.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("select name from data where email=? and pass=?");
			prepareStatement.setString(1, dto.getEmail());
			prepareStatement.setString(2, dto.getPass());
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			name=resultSet.getString(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
}
}