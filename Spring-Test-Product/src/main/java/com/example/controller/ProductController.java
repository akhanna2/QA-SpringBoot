package com.example.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public Product create(@RequestBody Product prod) {
		return this.service.addProduct(prod);
	}
	
	@GetMapping("/read")
	public List<Product> read() {
		return this.service.readProduct();
	}
	
	@PutMapping("/update/{id}")
	public Product update(@PathVariable Long id,@RequestBody Product prod) {
		return this.service.updateProduct(id, prod);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		this.service.deleteProduct(id);
	}
	
	@GetMapping("/readbybrand/{brand}")
	public List<Product> readByBrand(@PathVariable String brand){
		return this.service.findProductByBrand(brand);
	}
	
	@GetMapping("/readbyname/{name}")
	public List<Product> readByName(@PathVariable String name){
		return this.service.findProductByName(name);
	}
	
	@GetMapping("/home")
	public String home() {
		return "My home";
	}

}
