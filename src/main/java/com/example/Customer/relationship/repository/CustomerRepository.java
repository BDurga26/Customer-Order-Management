package com.example.Customer.relationship.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.relationship.entity.*;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	
	
	

}
