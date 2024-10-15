package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
