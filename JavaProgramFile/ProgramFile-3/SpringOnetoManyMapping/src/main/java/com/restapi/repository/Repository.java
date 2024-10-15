package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entities.Student;

public interface Repository extends JpaRepository<Student,Integer> {

}
