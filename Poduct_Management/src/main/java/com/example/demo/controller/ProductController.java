package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.services.ProductServices;

@RestController
public class ProductController {
	@Autowired
	ProductServices service;

	@GetMapping("/api/products")
	List<Product> getAllProducts() {
		return service.getProducts();
	}
    
}
