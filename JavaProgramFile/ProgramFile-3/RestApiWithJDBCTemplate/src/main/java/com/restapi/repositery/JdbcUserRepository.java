package com.restapi.repositery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restapi.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", this::mapRowToUser);
    }

    @Override
    public User findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", this::mapRowToUser, id);
    }

    @Override
    public User save(User user) {
        jdbcTemplate.update("INSERT INTO users(name, email) VALUES (?,?)" ,user.getName(), user.getEmail());
        return user;
    }

    @Override
    public void update(User user) {
        jdbcTemplate.update("UPDATE users SET name = ?, email = ? WHERE id = ?", user.getName(), user.getEmail(), user.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);
    }

    private User mapRowToUser(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    }
}

