package com.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dto.User;
import com.rowmapper.UserRowMapper;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean insert(User dto) {
		String sql="insert into user22(name,email,password,mobile)values(?,?,?,?)";
		jdbcTemplate.update(connection->{
			System.out.println(connection);
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
	public User getByEmailAndName(User dto) {
		String sql="select*from user12 where name=? and email=?";
		List<User>users=jdbcTemplate.query(sql, new Object[] {dto.getName(),dto.getEmail()}, new UserRowMapper());
		return users.isEmpty()?null:users.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		String sql="select*from user22";
		return jdbcTemplate.query(sql, new UserRowMapper());
	}

	@Override
	public User getById(int id) {
		String sql="select*from user22 where id=?";
		return jdbcTemplate.queryForObject(sql,new UserRowMapper(),id);
	}

	@Override
	public boolean updateUser(User dto) {
		String sql="update user22 set name=?,email=?,password=?,mobile=? where id=?";
		jdbcTemplate.update(sql, dto.getName(),dto.getEmail(),dto.getPassword(),dto.getMobile() ,dto.getId());
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		String sql="delete from user22 where id=?";
		jdbcTemplate.update(sql, id);
		return true;
	}

}
