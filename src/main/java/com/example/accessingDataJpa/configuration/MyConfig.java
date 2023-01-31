/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.accessingDataJpa.configuration;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ААФ
 */
@Configuration
public class MyConfig {
    @Bean
        public CommandLineRunner demo(CustomerRepository repository){
            return(args) -> {
                repository.save(new Customer("Jack", "Black"));
                repository.save(new Customer("Cock", "Pock"));
                repository.save(new Customer("Mack", "Slack"));
                repository.save(new Customer("Luck", "Black"));
                repository.save(new Customer("Chuchello", "Miaouchello"));
//                
//                log.info("Customers found with findAll():");
//                log.info("===============================");
//                for(Customer cust : repository.findAll()){
//                    log.info(cust.toString());
//                }
//                log.info("===============================");
//                log.info("");
//                
//                Customer cust = repository.findById(2L);
//                log.info("Customers found with findById(2L):");
//                log.info("===============================");                
//                    log.info(cust.toString());                
//                log.info("===============================");
//                log.info("");
//                
//                log.info("Customers found with findByLastName('Black'):");
//                log.info("===============================");
//                for(Customer custer : repository.findByLastName("Black")){
//                    log.info(custer.toString());
//                }
//                log.info("===============================");    

                System.out.println("Customers found with findAll():");
                System.out.println("===============================");
                for(Customer cust : repository.findAll()){
                    System.out.println(cust.toString());
                }
                System.out.println("===============================");
                System.out.println("");

            };
        }
}
