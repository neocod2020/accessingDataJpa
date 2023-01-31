package com.example.accessingDataJpa;

import com.example.accessingDataJpa.entity.Customer;
import com.example.accessingDataJpa.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {
    
 //   private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
    
//    @Autowired
//   AppTester tester; 

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}
        
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


