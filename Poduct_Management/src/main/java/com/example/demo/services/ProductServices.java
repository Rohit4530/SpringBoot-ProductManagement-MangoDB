package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.model.Review;

@Service
public class ProductServices {
	@Autowired
	ProductRepository repo;

	@PostConstruct
	public void init() {
		repo.deleteAll();
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("vinay", "good products"));
		Product p = new Product("1", "Laptop", "Sample HP Laptop", 45000, reviews);
		repo.save(p);
	}

	public List<Product> getProducts() {
		List<Product> ans = repo.findAll();
		return ans;
	}

	public Product addProduct(Product prod) {
		return repo.save(prod);
	}
}
