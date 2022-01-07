package com.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.Product;
import com.backend.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public List<Product> getProducts() {
		List<Product> response = productRepository.findAll();
		return response;
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

}
