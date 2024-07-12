package com.manager.customer.customermanager.repository;


import com.manager.customer.customermanager.dto.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastnameAndDateOfBirth(String lastname, Date dateOfBirth);
    List<Customer> findByLastnameAndFirstnameAndZip(String lastname, String firstname, String zip);


}
