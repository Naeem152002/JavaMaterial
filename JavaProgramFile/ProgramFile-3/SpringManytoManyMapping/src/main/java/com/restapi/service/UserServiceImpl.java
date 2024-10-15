package com.restapi.service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dto.CategoryDto;
import com.restapi.dto.ProductDto;
import com.restapi.entities.Category;
import com.restapi.entities.Product;
import com.restapi.repository.CategoryRepo;
import com.restapi.repository.ProductRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;
@Override
    public String registerStudentForCourse(int categoryId, int productId) {
    //    Category category = categoryRepo.findById(categoryId).orElse(null);
       // Product product = productRepo.findById(productId).orElse(null);

//        if (category != null && product != null) {
//            if (!category.getProduct().contains(product)) {
//                category.getProduct().add(product);
//                categoryRepo.save(category);
//                return "Category registered for the product successfully.";
//            } else {
//                return "Category is already registered for the product.";
//            }
//        } else {
//            return "Student or course not found.";
//        }
	return null;
   }

    public CategoryDto mapToDto(Category category) {
        return modelMapper.map(category, CategoryDto.class);
    }

    public ProductDto mapToDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }
}
