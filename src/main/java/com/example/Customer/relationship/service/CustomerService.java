package com.example.Customer.relationship.service;
import com.example.Customer.relationship.entity.*;
import com.example.Customer.relationship.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private static CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public static Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public static void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}