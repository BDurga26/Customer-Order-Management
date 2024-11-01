package com.example.Customer.relationship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Change customer_id to id
    private String customerName;  // Change customer_name to customerName
    private String phoneNumber;    // Change phone_number to phoneNumber
    private String city;

    // Constructors, getters, and setters
    public Customer() {}

    public Customer( String customerName, String phoneNumber, String city) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
