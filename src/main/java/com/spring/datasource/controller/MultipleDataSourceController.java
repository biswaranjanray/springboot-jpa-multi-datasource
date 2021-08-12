package com.spring.datasource.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.datasource.customer.repository.CustomerRepository;
import com.spring.datasource.entities.customer.Customer;
import com.spring.datasource.entities.product.Product;
import com.spring.datasource.product.repository.ProductRepository;

@RestController
@ComponentScan(basePackages = "{com.spring.datasource.*}")
public class MultipleDataSourceController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void save() {
		customerRepository.saveAll(Stream.of(new Customer(101, "John", "john@gamil.com", "Brisbane"),
				new Customer(102, "Alex", "alex@gamil.com", "London")).collect(Collectors.toList()));
		productRepository.saveAll(Stream.of(new Product(201, "mouse", 399.00, 1), 
				new Product(205, "keyboard", 2999.00, 2)).collect(Collectors.toList()));
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}
