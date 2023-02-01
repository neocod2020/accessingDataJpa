/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.accessingDataJpa.configuration;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ААФ
 */
@Configuration
public class MyConfig {

    @Autowired
    AppTester tester;

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            tester.run();
        };
    }
}
