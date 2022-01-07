package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Product;
import com.backend.service.ProductService;

@RestController
@RequestMapping("v1/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	@GetMapping
	public List<Product> findAllProducts(){
		return productService.getProducts();
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") Long id) {
		productService.deleteProduct(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
}
