package com.onlineshoppingsystem.services;
import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.model.Product;

public interface ProductService {
    Response addProduct(Product product);
    Response updateProduct(Product product, Long productId);
    Response deleteProductById(Long id);
    Response  getProductById(Long id);
    Response getAllProducts();
    Response getProductsByCategory(String category);
    Response getProductsByBrand(String brand);
    Response getProductsByCategoryAndBrand(String category, String brand);
    Response getProductsByName(String name);
    Response getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
