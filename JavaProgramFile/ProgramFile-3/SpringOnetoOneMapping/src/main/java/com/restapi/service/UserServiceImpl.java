package com.restapi.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dto.AddressDto;
import com.restapi.dto.StudentDto;
import com.restapi.entities.Address;
import com.restapi.entities.Student;
import com.restapi.mapper.Mapper;
import com.restapi.repository.Repository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public Repository repository;
	ModelMapper modelMapper = Mapper.getMapper();
	 
	public UserServiceImpl()
	{	
	}
	
	@Override
	public StudentDto addStudent(StudentDto studentDto) {
		Student student= this.modelMapper.map(studentDto, Student.class);
		Address address=student.getAddress();
		address.setStudent(student);
		
	this.repository.save(student);
	AddressDto AddressDto= this.modelMapper.map(address, AddressDto.class);
	StudentDto dto= this.modelMapper.map(student, StudentDto.class);
		dto.setAddressDto(AddressDto);
	return dto;
	}
	@Override
	public StudentDto addStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(StudentDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
