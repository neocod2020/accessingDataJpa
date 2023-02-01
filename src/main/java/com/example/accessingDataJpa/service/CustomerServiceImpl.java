/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.accessingDataJpa.service;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>)repository.findAll();
    }

    @Override
    public List<Customer> getAllCustomersByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
         repository.save(customer);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);    }
    
}
