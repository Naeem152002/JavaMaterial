package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
