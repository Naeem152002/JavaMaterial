package com.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dto.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(User dto) {
		String sql="insert into user24(name,email,password,mobile)values(?,?,?,?)";
		jdbcTemplate.update(connection->{
			System.out.println(connection);
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getMobile());
			
			return ps;
		});
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getByEmailAndName(User dto) {
		String sql="select*from user24 where name=? and email=?";
		List<User>users=jdbcTemplate.query(sql, new Object[] {dto.getName(),dto.getEmail()} ,(rs,rowNum)->{
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
		String sql="select*from user24";
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
	public User getById(int id) {
		String sql="select*from user24 where id=?";
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
	public void updateUser(User dto) {
		String sql="update user24 set name=?,email=?,password=?,mobile=? where id=?";
		jdbcTemplate.update(sql,dto.getName(),dto.getEmail(),dto.getPassword(),dto.getMobile(),dto.getId());
		
	}

	@Override
	public void deleteUser(int id) {
		String sql="delete from user24 where id=?";
		jdbcTemplate.update(sql,id);
		
	}
	
		
		
	}


