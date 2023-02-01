package com.example.accessingDataJpa.service;

import com.example.accessingDataJpa.entity.Customer;
import java.util.List;

/**
 *
 * @author ААФ
 */
public interface CustomerService {
    public List<Customer> getAllCustomers();
    
    public List<Customer> getAllCustomersByLastName(String lastName);
    
    public Customer getCustomerById(Long id);
    
    public void save(Customer customer);
    
    public void deleteById(Long id);
    
}
