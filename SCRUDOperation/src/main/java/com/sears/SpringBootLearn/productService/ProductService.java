package com.sears.SpringBootLearn.productService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sears.SpringBootLearn.pojo.Product;
import com.sears.SpringBootLearn.productReposiitory.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> listAll() {
		return productRepository.findAll();
	}

	public void save(Product product) {
		productRepository.save(product);
	}

	public Product get(int id) {
		return productRepository.findById(id).get();
	}
	public void delete(int id) {
		productRepository.deleteById(id);
	}
}
