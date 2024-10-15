package com.onlineshoppingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.model.Category;
import com.onlineshoppingsystem.services.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	@Autowired
    private CategoryService categoryService;
    
    @PostMapping("/add")
    public ResponseEntity<Response> addCategory(@RequestBody Category category) {
           return ResponseEntity.ok(categoryService.addCategory(category));
        }
   
    @PutMapping("/update/{id}")
    public ResponseEntity<Response> updateCategory(@PathVariable Long id, @RequestBody Category category) {
    	return ResponseEntity.ok(categoryService.updateCategory(category, id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteCategory(@PathVariable Long id){
    	return ResponseEntity.ok(categoryService.deleteCategoryById(id));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Response> getCategoryById(@PathVariable Long id){
    	return ResponseEntity.ok(categoryService.getCategoryById(id));
    }
    
    @GetMapping("/by-name/{name}")
    public ResponseEntity<Response> getCategoryByName(@PathVariable String name){
    	return ResponseEntity.ok(categoryService.getCategoryByName(name));
    }
    @GetMapping("/all")
    public ResponseEntity<Response> getAllCategories() {
    	return ResponseEntity.ok(categoryService.getAllCategories()); 
    }

    
    }


