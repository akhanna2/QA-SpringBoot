package com.example.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.repo.ProductRepo;

@Service
public class ProductService {
	
	private ProductRepo repo;
	
	//public List<Product> list = new ArrayList<Product>();
	
	
	public ProductService(ProductRepo repo) {
		super();
		this.repo = repo;
	}

	public Product addProduct(Product prod) {
		return this.repo.save(prod);
	}
	

	public List<Product> readProduct() {
		return this.repo.findAll();
	}
	
	public Product updateProduct(Long id, Product prod) {
		Optional<Product> myTempProduct = Optional.of(this.repo.findById(id).orElseThrow(ProductNotFoundException::new));
		Product existingProduct = myTempProduct.get();
		//existingProduct.setId(prod.getId()); // because you dont change primary key
		existingProduct.setName(prod.getName());
		existingProduct.setBrand(prod.getBrand());
		return this.repo.save(existingProduct);
	}
	
	public boolean deleteProduct(Long id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public List<Product> findProductByBrand(String brand){
		return this.repo.findProductByBrand(brand);
	}
	
	public List<Product> findProductByName(String name){
		return this.repo.findProductByName(name);
	}
	
}
