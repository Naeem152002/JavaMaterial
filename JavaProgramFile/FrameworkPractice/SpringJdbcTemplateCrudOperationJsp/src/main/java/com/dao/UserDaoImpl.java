package com.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dto.User;

public class UserDaoImpl implements UserDao{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean insert(User dto) {
		String sql="insert into user12(name,email,password,mobile)values(?,?,?,?)";
		jdbcTemplate.update(connection->{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			
			return ps;
		});
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getByEmailandName(User dto) {
		String sql="select*from user12 where name=? and email=?";
		List<User>users=jdbcTemplate.query(sql, new Object[] {dto.getName(),dto.getEmail()}, (rs,rowNum)->{
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
		String sql="select*from user12";
		return jdbcTemplate.query(sql, (rs,rowNum)->{
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
	public User getBYId(int id) {
String sql="select*from user12 where id=?";
return jdbcTemplate.queryForObject(sql, (rs,rowNum)->{
	User u=new User();
	u.setId(rs.getInt("id"));
	u.setName(rs.getString("name"));
	u.setEmail(rs.getString("email"));
	u.setPassword(rs.getString("password"));
	u.setMobile(rs.getString("mobile"));
	
	return u;
	
	
}, id);
		
	}

	@Override
	public boolean updateUser(User dto) {
		 String sql = "UPDATE user12 SET name=?, email=?, password=?, mobile=? WHERE id=?";
		jdbcTemplate.update(sql, dto.getName(),dto.getEmail(),dto.getPassword(),dto.getMobile(),dto.getId());
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		String sql="delete from user12 where id=?";
	jdbcTemplate.update(sql, id);
		return true;
	}
	

}
