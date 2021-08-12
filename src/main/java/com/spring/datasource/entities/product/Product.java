package com.spring.datasource.entities.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product")
public class Product {

	@Id
	private int pid;
	private String productName;
	private double price;
	private int quantity;
}
