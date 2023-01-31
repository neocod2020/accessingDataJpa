package com.example.accessingDataJpa.repository;

import com.example.accessingDataJpa.entity.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ААФ
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
    List<Customer> findByLastName(String lastName);
    
    Customer findById(long id);
}
