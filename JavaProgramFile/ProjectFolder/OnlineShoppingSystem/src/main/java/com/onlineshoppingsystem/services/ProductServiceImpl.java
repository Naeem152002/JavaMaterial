package com.onlineshoppingsystem.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.onlineshoppingsystem.dto.ProductDto;
import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.exceptions.OurException;
import com.onlineshoppingsystem.exceptions.ResourceNotFoundException;
import com.onlineshoppingsystem.model.Category;
import com.onlineshoppingsystem.model.Product;
import com.onlineshoppingsystem.repository.CategoryRepository;
import com.onlineshoppingsystem.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;


    @Override
    public Response addProduct(Product product) {
        // check if the category is found in the DB
        // If Yes, set it as the new product category
        // If No, the save it as a new category
        // The set as the new product category.
    	Response response=new Response();

        Category category = Optional.ofNullable(categoryRepository.findByName(product.getCategory().getName()))
                .orElseGet(() -> {
                    Category newCategory = new Category(product.getCategory().getName());//ye create krne ke baad fetch krta hain
                    return categoryRepository.save(newCategory);
                });
        System.out.println(category);
        product.setCategory(category);
    	Product prod=productRepository.save(product);
    	ProductDto pr=modelMapper.map(prod, ProductDto.class);
    	response.setProduct(pr);
    	return response;
    }
    @Override
    public Response updateProduct(Product product, Long id) {
    	Response response=new Response();
    	Product prod= productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
    	Category category = Optional.ofNullable(categoryRepository.findByName(product.getCategory().getName()))
                .orElseGet(() -> {
                    Category newCategory = new Category(product.getCategory().getName());//ye create krne ke baad fetch krta hain
                    return categoryRepository.save(newCategory);
                });
    	prod.setName(product.getName());
    	prod.setBrand(product.getBrand());
    	prod.setInventory(product.getInventory());
    	prod.setPrice(product.getPrice());
    	prod.setDescription(product.getDescription());
    	prod.setCategory(category);
    	Product p=productRepository.save(prod);
    	ProductDto dto=modelMapper.map(p, ProductDto.class);
    	response.setProduct(dto);
        return response;
    }
    @Override
    public Response deleteProductById(Long id) {
    	Response response=new Response();
    	 Product product= productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
    	product.setCategory(null);
    	 productRepository.delete(product);
    	 response.setMessage("Product Successfully Deleted");
    	 return response;
    }

    @Override
    public Response getProductById(Long id) {
    	Response response=new Response();
       Product product= productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Product","Id",id));
       ProductDto productDto=modelMapper.map(product, ProductDto.class);
       response.setProduct(productDto);
        return response;
    }


    @Override
    public Response getAllProducts() {
    	Response response=new Response();
    	List<Product>productList=productRepository.findAll();
    	List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
        response.setProductList(dtoList);
         return response;
    }

    @Override
    public Response getProductsByCategory(String category) {
    	Response response=new Response();
    	List<Product>productList= productRepository.findByCategoryName(category);
    	if(productList.isEmpty()) {
    		throw new OurException("Category");
    	}
    	List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
        response.setProductList(dtoList);
         return response;
    }

    @Override
    public Response getProductsByBrand(String brand) {
    	Response response=new Response();
    	List<Product>productList =productRepository.findByBrand(brand);
    	if(productList.isEmpty()) {
    		throw new OurException("Brand");
    	}
    	List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
        response.setProductList(dtoList);
         return response;
    }

    @Override
    public Response getProductsByCategoryAndBrand(String category, String brand) {
    	Response response=new Response();
    	List<Product>productList=productRepository.findByCategoryNameAndBrand(category, brand);
    	if(productList.isEmpty()) {
    		throw new OurException("This brand"+category);
    	}
    	List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
        response.setProductList(dtoList);
         return response;
    }

    @Override
    public Response getProductsByName(String name) {
    	Response response=new Response();
    	List<Product>productList = productRepository.findByName(name);
    	if(productList.isEmpty()) {
    		throw new OurException(name);
    	}
    	List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
        response.setProductList(dtoList);
         return response;
    }

    @Override
    public Response getProductsByBrandAndName(String brand, String name) {
    	Response response=new Response();
        List<Product>productList= productRepository.findByBrandAndName(brand, name);
       List<ProductDto>dtoList= productList.stream().map(product->modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
       if(productList.isEmpty()) {
   		throw new OurException("This brand:"+name);
   	}
       response.setProductList(dtoList);
        return response;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return productRepository.countByBrandAndName(brand, name);
    }


}
