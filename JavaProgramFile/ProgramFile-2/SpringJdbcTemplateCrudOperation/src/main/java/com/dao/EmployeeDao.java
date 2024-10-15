package com.dao;

import java.util.List;

import com.dto.Employee;


public interface EmployeeDao {
	public boolean insert(Employee emp); 
	public Employee getEmployeeById(int id);
	public Employee getByEmailAndName(String email, String name);
	public List<Employee>getAllEmployees();
	public boolean deleteEmployee(int id) ;
	public boolean updateEmployee(Employee emp) ;
	
}
