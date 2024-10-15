package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.db.ConnectionProvider;
import com.dto.User;
@Repository
public class UserDaoImpl implements UserDao{
	Connection con=ConnectionProvider.getConnectionProvider();

	@Override
	public void insert(User dto) {
		String sql="insert into user25(name,email,password,mobile)values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public User getByEmailAndName(User dto) {
		String sql="select*from user25 where name=? and email=?";
		List<User>users=new ArrayList<User>();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setMobile(rs.getString("mobile"));
				users.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users.isEmpty()?null:users.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		String sql="select*from user25";
		List<User>users=new ArrayList<User>();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
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
	public User getByUserId(int id) {
	     String sql="select*from user25 where id=?";
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
	public void updateUser(User dto) {
		String sql="update user25 set name=?, email=?,password=?,mobile=? where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			ps.setInt(5, dto.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUser(int id) {
		String sql="delete from user25 where id=?";
	    try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
