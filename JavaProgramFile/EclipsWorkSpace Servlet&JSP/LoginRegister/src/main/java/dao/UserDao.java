package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dbconnection.DbConnection;
import dto.Dto;
import ui.WelcomeUi;

public class UserDao {
	public static void registerDao(Dto dto) {
		Connection con= DbConnection.getConnection();
		PreparedStatement preparedStatement;
		try {
		preparedStatement = con.prepareStatement("insert into data values(?,?,?,?)");
		preparedStatement.setString(1,dto.getName());
		preparedStatement.setString(2,dto.getEmail());
		preparedStatement.setString(3,dto.getMobile());
		preparedStatement.setString(4,dto.getPass());
		preparedStatement.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException p) {
				// TODO Auto-generated catch block
				p.printStackTrace();
			}
		}
	}
	public static void loginDao(String email,String pass) {
		Connection connection = null;
		try {
			String name;
			connection=DbConnection.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement("select * from data where email=? and pass=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, pass);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(new validation.Validation().validateLogin(email, pass)) {
				resultSet.next();
				name=resultSet.getString(1);
			if (!name.equals(null)) {
				JOptionPane.showMessageDialog(new JOptionPane(), "Successfully Logged In");
				PreparedStatement preparedStatement1= connection.prepareStatement("select * from data");
				ResultSet resultSet1 = preparedStatement1.executeQuery();
				ResultSetMetaData data=preparedStatement1.getMetaData();
				int row=0;
				while (resultSet1.next()) {
					row++;
				}
				int cols=data.getColumnCount();
				String rows[][]=new String[row+1][cols];
				String columns[]=new String[cols];
				PreparedStatement preparedStatement2= connection.prepareStatement("select * from data");
				ResultSet resultSet2 = preparedStatement2.executeQuery();
				int r=0;
				for (int i = 0; i < columns.length; i++) {
					rows[r][i]=data.getColumnName(i+1);
					columns[i]=data.getColumnName(i+1);
				}
				r++;
				while (resultSet2.next()) {
					int c=0;
					rows[r][c++]=resultSet2.getString(1);
					rows[r][c++]=resultSet2.getString(2);
					rows[r][c++]=resultSet2.getString(3);
					rows[r][c++]=resultSet2.getString(4);
					r++;
				}
				new WelcomeUi(rows,columns);
			}
			else {
				JOptionPane.showMessageDialog(new JOptionPane(), "Invalid Details");
			}
			}
			else {
				JOptionPane.showMessageDialog(new JOptionPane(), "Invalid Details");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException p) {
				// TODO Auto-generated catch block
				p.printStackTrace();
			}
		}
	}
}