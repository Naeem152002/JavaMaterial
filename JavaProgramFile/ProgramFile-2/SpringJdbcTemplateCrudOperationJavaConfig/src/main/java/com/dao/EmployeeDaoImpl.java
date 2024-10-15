package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dto.Employee;
@Component(value="dao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public boolean insert(Employee emp) {
		String sql="insert into emp11 (name,email,mobile,password) values(?,?,?,?)";
		jdbcTemplate.update(connection->{
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1, emp.getName());
		ps.setString(2, emp.getEmail());
		ps.setString(3, emp.getMobile());
		ps.setString(4, emp.getPassword());
		return ps;
		});
		return true;
	}

	

	@Override
	public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM emp11 WHERE id=?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setEmail(rs.getString("email"));
            employee.setMobile(rs.getString("mobile"));
            employee.setPassword(rs.getString("password"));
            return employee;
        }, id);
    }
	@Override
	 public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM emp11";
        return jdbcTemplate.query(sql, ( rs, rowNum) -> {
            Employee e = new Employee();
            e.setId(rs.getInt("id"));
            e.setName(rs.getString("name"));
            e.setEmail(rs.getString("email"));
            e.setMobile(rs.getString("mobile"));
            e.setPassword(rs.getString("password"));
            return e;
        });
    }

	@Override
	public boolean deleteEmployee(int id) {
	        String sql = "DELETE FROM emp11 WHERE id = ?";
	        jdbcTemplate.update(sql, id);
			return true;
	    }

	@Override
	 public boolean updateEmployee(Employee emp) {
        String sql = "UPDATE emp11 SET name=?, email=?, mobile=?, password=? WHERE id=?";
        jdbcTemplate.update(sql, emp.getName(), emp.getEmail(), emp.getMobile(),
                emp.getPassword(), emp.getId());
		return true;
    }
	// Fetch by email and name
	@SuppressWarnings("deprecation")
	 @Override
	    public Employee getByEmailAndName(String name, String email) {
	        String sql = "SELECT * FROM emp11 WHERE name = ? AND email = ?";
	        List<Employee> employees = jdbcTemplate.query(sql, new Object[]{name, email}, (rs, rowNum) -> {
	            Employee e = new Employee();
	            e.setId(rs.getInt("id"));
	            e.setName(rs.getString("name"));
	            e.setEmail(rs.getString("email"));
	            e.setMobile(rs.getString("mobile"));
	            e.setPassword(rs.getString("password"));
	            return e;
	        });

	        return employees.isEmpty() ? null : employees.get(0);
	    }
}
