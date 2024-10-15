package com.restapi.service;

import java.util.List;
import java.util.stream.Collectors;

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
	    Student student = modelMapper.map(studentDto, Student.class);
	    
	    // Set the student for each address
//	    List<Address> addresses = student.getAddress();
//	    addresses.forEach(address -> address.setStudent(student));

	    repository.save(student);

	    // Map the saved student and its addresses to DTOs
	    StudentDto dto = modelMapper.map(student, StudentDto.class);
	  //  List<AddressDto> addressDtos = addresses.stream()
//	            .map(address -> modelMapper.map(address, AddressDto.class))
//	            .collect(Collectors.toList());
//	    dto.setAddressDto(addressDtos);

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
