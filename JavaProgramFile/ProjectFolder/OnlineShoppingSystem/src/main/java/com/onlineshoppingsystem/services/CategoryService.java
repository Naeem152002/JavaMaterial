package com.onlineshoppingsystem.services;

import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.model.Category;

public interface CategoryService {
	Response addCategory(Category category);

	Response updateCategory(Category category, Long id);

	Response deleteCategoryById(Long id);

	Response getCategoryById(Long id);

	 Response getCategoryByName(String name);

	Response getAllCategories();

}
