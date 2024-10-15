package com.onlineshoppingsystem.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshoppingsystem.dto.CategoryDto;
import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.exceptions.AlreadyExistException;
import com.onlineshoppingsystem.exceptions.OurException;
import com.onlineshoppingsystem.exceptions.ResourceNotFoundException;
import com.onlineshoppingsystem.model.Category;
import com.onlineshoppingsystem.model.Product;
import com.onlineshoppingsystem.repository.CategoryRepository;
import com.onlineshoppingsystem.repository.ProductRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
    private  CategoryRepository categoryRepository;
	@Autowired
	private  ProductRepository productRepository;
	@Autowired
    private  ModelMapper modelMapper;
    
    
    @Override
    public Response addCategory(Category category) {
    	Response response=new Response();
    	if (categoryRepository.existsByName(category.getName())) {
            throw new AlreadyExistException(category.getName() + "=Already Exists");
        }
    	Category cat=categoryRepository.save(category);
    	CategoryDto dto=modelMapper.map(cat, CategoryDto.class);
    	response.setCategory(dto);
    	return response;
    }


	@Override
	public Response updateCategory(Category category, Long id) {
		Response response=new Response();
		Category categor=categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category","Id",id));
		categor.setName(category.getName());
		Category cat=categoryRepository.save(categor);
		CategoryDto dto=modelMapper.map(cat, CategoryDto.class);
    	response.setCategory(dto);
    	return response;
	}


	@Override
	public Response deleteCategoryById(Long id) {
		Response response=new Response();
		Category category=categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category","Id",id));
		 for (Product product : category.getProducts()) {
             product.setCategory(null); // Unlink the post from the user
            productRepository.delete(product); // Delete the post
         }
		categoryRepository.delete(category);
		response.setMessage("Category Deleted Successfully");
		return response;
	}


	@Override
	public Response getCategoryById(Long id) {
		Response response=new Response();
		Category category=categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category","Id",id));
    	CategoryDto dto=modelMapper.map(category, CategoryDto.class);
    	response.setCategory(dto);
    	return response;
	}


	@Override
	public Response getCategoryByName(String name) {
		Response response=new Response();
		Category category=categoryRepository.findByName(name);
		if(category==null) {
		throw new OurException("Category");
		}
		CategoryDto dto=modelMapper.map(category, CategoryDto.class);
		response.setCategory(dto);
    	return response;
	}
	@Override
	public Response getAllCategories() {
		Response response=new Response();
		List<Category>categoryList=categoryRepository.findAll();
		if(categoryList.isEmpty()) {
			throw new OurException("CategoryList");
		}
		List<CategoryDto>dtoList=categoryList.stream().map(category->modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
		response.setCategoryList(dtoList);
		return response;
	}}


