package com.manager.customer.customermanager;

import com.manager.customer.customermanager.dto.Customer;
import com.manager.customer.customermanager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class CustomerManagerApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

//        customerRepository.saveAll(Arrays.asList(
//                new Customer("John", "Doe", LocalDate.of(1980, 1, 1), "123 Main St", "Springfield", "IL", "62701", "john.doe@example.com", "555-1234"),
//                new Customer("Jane", "Smith", LocalDate.of(1990, 5, 15), "456 Oak St", "Springfield", "IL", "62701", "jane.smith@example.com", "555-5678"),
//                new Customer("Alice", "Johnson", LocalDate.of(1985, 3, 30), "789 Pine St", "Springfield", "IL", "62701", "alice.johnson@example.com", "555-8765"),
//                new Customer("Bob", "Williams", LocalDate.of(1975, 7, 20), "321 Elm St", "Springfield", "IL", "62701", "bob.williams@example.com", "555-4321")
//        ));

        System.out.println("----------All Data saved into Database----------------------");
    }

}

