package com.spring.datasource.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.datasource.entities.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
