package com.example.accessingDataJpa.configuration;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ААФ
 */
@Component
public class AppTester {

    @Autowired
    CustomerRepository repository;

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
        for (Customer cust : repository.findAll()) {
            System.out.println(cust.toString());
        }
        System.out.println("===============================");
        System.out.println("");
    }
}
