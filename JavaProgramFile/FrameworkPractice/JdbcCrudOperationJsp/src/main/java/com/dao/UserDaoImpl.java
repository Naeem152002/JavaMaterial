package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.ConnectionProvider;
import com.dto.User;

public class UserDaoImpl implements UserDao{
	Connection con=ConnectionProvider.getConnectionProvider();

	@Override
	public boolean insert(User dto) {
		String sql="insert into user21 (name,email,password,mobile)values(?,?,?,?)";
		try {
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public User getByEmailAndName(User dto) {
		String sql="select*from user21 where name=? and email=?";
		User u=null;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				 u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setMobile(rs.getString("mobile"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		String sql="select*from user21";
		List<User>users=new ArrayList<User>();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				User u=new User();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setEmail(rs.getString("email"));
					u.setPassword(rs.getString("password"));
					u.setMobile(rs.getString("mobile"));
					users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getById(int id) {
		String sql="select*from user21 where id=?";
		User u=null;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				 u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setMobile(rs.getString("mobile"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public boolean updateUser(User dto) {
		String sql="update user21 set name=?, email=?,password=?,mobile=? where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			ps.setInt(5, dto.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		String sql="delete from user21 where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
