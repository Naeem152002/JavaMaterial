package com.example.repo;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entitis.User;
@Repository
public class UserRepoImpl implements UserRepo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insert(User user) {
		String sql="insert into user30(name,email,password,mobile)values(?,?,?,?)";
		jdbcTemplate.update(connection->{
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getMobile());
				
		return ps;
		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getByNameAndEmail(String name,String email) {
		String sql="select*from user30 where name=? and email=?";
		List<User>users=jdbcTemplate.query(sql, new Object[] {name,email}, (rs,rowNum)->{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("password"));
			u.setMobile(rs.getString("mobile"));
			return u;
		});
		return users.isEmpty()?null:users.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		String sql="select*from user30";
		return jdbcTemplate.query(sql,(rs,rowNum)->{
			
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("password"));
			u.setMobile(rs.getString("mobile"));
			return u;	
		});
		
	}

	@Override
	public User getById(int id) {
		String sql="select*from user30 where id=?";
		return jdbcTemplate.queryForObject(sql, (rs,rowNum)->{ 
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("password"));
			u.setMobile(rs.getString("mobile"));
			return u;	
			
			
		},id);
	}

	@Override
	public void updateUser(User user) {
		String sql="update user30 set name=?,email=?,password=?, mobile=? where id=?";
		jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPassword(),user.getMobile(),user.getId());
		
	}

	@Override
	public void deleteUser(int id) {
		String sql="delete from user30 where id=?";
		jdbcTemplate.update(sql,id);
		
	}

}
