package com.onlineshoppingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshoppingsystem.model.Image;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
