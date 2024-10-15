package com.onlineshoppingsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoppingsystem.dto.Response;
import com.onlineshoppingsystem.model.Product;
import com.onlineshoppingsystem.services.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
	private final ProductService productService;

	@PostMapping("/add")
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);

	}

	@PutMapping("/update/{productId}")
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Response> updateProduct(@RequestBody Product product, @PathVariable Long productId) {
		return ResponseEntity.ok(productService.updateProduct(product, productId));
	}

	@DeleteMapping("/delete/{productId}")
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Response> deleteProduct(@PathVariable Long productId) {
		return ResponseEntity.ok(productService.deleteProductById(productId));
	}

	@GetMapping("/{productId}")
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Response> getProductById(@PathVariable Long productId) {
		return ResponseEntity.ok(productService.getProductById(productId));

	}

	@GetMapping("/all")
	//@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Response> getAllProducts() {
		return ResponseEntity.ok(productService.getAllProducts());
	}

	@GetMapping("/category/{category}")
	public ResponseEntity<Response> findProductByCategory(@PathVariable String category) {
		return ResponseEntity.ok(productService.getProductsByCategory(category));
	}

	@GetMapping("/by-brand/")
	public ResponseEntity<Response> findProductByBrand(@RequestParam String brand) {
		return ResponseEntity.ok(productService.getProductsByBrand(brand));
	}

	@GetMapping("/by-category-and-brand")
	public ResponseEntity<Response> getProductByCategoryAndBrand(@RequestParam String category,
			@RequestParam String brand) {
		return ResponseEntity.ok(productService.getProductsByCategoryAndBrand(category, brand));
	}

	@GetMapping("/by-name/{name}")
	public ResponseEntity<Response> getProductByName(@PathVariable String name) {
		return ResponseEntity.ok(productService.getProductsByName(name));
	}
	@GetMapping("/by-brand-and-name")
	public ResponseEntity<Response> getProductByBrandAndName(@RequestParam String brand,
			@RequestParam String name) {
		return ResponseEntity.ok(productService.getProductsByBrandAndName(brand, name));
	}
	@GetMapping("/count/by-brand-and-name")
	public ResponseEntity<Long> countProductsByBrandAndName(@RequestParam String brand, @RequestParam String name) {
		return ResponseEntity.ok(productService.countProductsByBrandAndName(brand, name));
	}

}
