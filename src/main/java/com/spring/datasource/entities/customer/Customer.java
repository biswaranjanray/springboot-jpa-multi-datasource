package com.spring.datasource.entities.customer;

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
@Table(name="Customer")
public class Customer {

	@Id
	private int id;
	private String customerName;
	private String email;
	private String address;
}
