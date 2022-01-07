package com.backend.service;

import java.util.List;

import com.backend.model.Product;

public interface ProductService {

	Product createProduct(Product product);
	
	List<Product> getProducts();
	
	void deleteProduct(Long id);
	
	Product updateProduct(Product product);
}
