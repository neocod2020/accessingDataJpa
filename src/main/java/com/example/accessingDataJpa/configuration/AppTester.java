package com.example.accessingDataJpa.configuration;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ААФ
 */
@Component
public class AppTester {

    @Autowired
    CustomerService repository;

    public AppTester() {
    }

    public void run() {
        repository.save(new Customer("Jack", "Black"));
        repository.save(new Customer("Cock", "Pock"));
        repository.save(new Customer("Mack", "Slack"));
        repository.save(new Customer("Luck", "Black"));
        repository.save(new Customer("Chuchello", "Miaouchello"));

        System.out.println("Customers found with findAll():");
        System.out.println("===============================");
        for (Customer cust : repository.getAllCustomers()) {
            System.out.println(cust.toString());
        }
        System.out.println("===============================");
        System.out.println("");
        
        System.out.println("Customer found by id = 2:");
        System.out.println("===============================");
        Customer cust = repository.getCustomerById(2L);
            System.out.println(cust.toString());
        
        System.out.println("===============================");
        System.out.println("");
        
        System.out.println("Customers found by lastName = 'Black':");
        System.out.println("===============================");
        for (Customer c: repository.getAllCustomersByLastName("Black")) {
            System.out.println(c.toString());
        }
        System.out.println("===============================");
        System.out.println("");
        
        System.out.println("Delete Customer by id = 2:");
        repository.deleteById(2L);
        System.out.println("Customers found with findAll():");
        System.out.println("===============================");
        for (Customer c : repository.getAllCustomers()) {
            System.out.println(c.toString());
        }
        System.out.println("===============================");
        System.out.println("");
        
    }
}
