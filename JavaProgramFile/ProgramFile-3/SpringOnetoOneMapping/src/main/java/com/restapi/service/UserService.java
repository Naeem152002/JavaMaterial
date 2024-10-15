package com.restapi.service;

import java.util.List;

import com.restapi.dto.StudentDto;

public interface UserService
{
	    StudentDto addStudent(StudentDto student);
	    StudentDto addStudentById(int id);
	    List<StudentDto> findAll();
	    void update(StudentDto user);
	    void delete(int id);
	   
}
