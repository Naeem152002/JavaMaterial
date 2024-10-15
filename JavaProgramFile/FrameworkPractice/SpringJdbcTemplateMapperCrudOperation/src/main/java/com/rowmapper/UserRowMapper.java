package com.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dto.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u=new User();
		u.setId(rs.getInt("id"));
		u.setName(rs.getString("name"));
		u.setEmail(rs.getString("email"));
		u.setPassword(rs.getString("password"));
		u.setMobile(rs.getString("mobile"));
		return u;
	}

}
