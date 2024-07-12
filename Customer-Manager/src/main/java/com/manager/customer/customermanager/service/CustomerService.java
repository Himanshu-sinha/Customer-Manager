package com.manager.customer.customermanager.service;

import com.manager.customer.customermanager.dto.Customer;
import com.manager.customer.customermanager.exception.CustomerBadRequestException;
import com.manager.customer.customermanager.exception.CustomerNotFoundException;
import com.manager.customer.customermanager.repository.CustomerRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findCustomersByExample(Customer customer) {
        Example<Customer> customerExample = Example.of(customer);
        List<Customer> all = customerRepository.findAll(customerExample);
        System.out.println(all);
        return all;
    }

//    public Customer updateEmployee(Long id, Customer customerDetails) {
//        Customer employee = customerRepository.findById(id)
//                .orElseThrow(() -> new CustomerNotFoundException("Employee not found with id: " + id));
////        if (customerDetails.getFirstname() == null || customerDetails.getLastname() == null || employeeDetails.getCity() == null) {
////            throw new CustomerBadRequestException("Employee details are incomplete");
////        }
//        employee.setFirstName(employeeDetails.getFirstName());
//        employee.setLastName(employeeDetails.getLastName());
//        employee.setCity(employeeDetails.getCity());
//        return employeeRepository.save(employee);
//    }
}

