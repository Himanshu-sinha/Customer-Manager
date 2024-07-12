package com.manager.customer.customermanager.controller;


import com.manager.customer.customermanager.dto.Customer;
import com.manager.customer.customermanager.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public ResponseEntity getCustomers() {
        List<Customer> allCustomer = customerService.getAllCustomer();
        if(!allCustomer.isEmpty()){
            return  ResponseEntity.ok(customerService.getAllCustomer()) ;
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.noContent().build());
    }

    @GetMapping("/search")
    public List<Customer> searchCustomers(
            @RequestParam(required = false) String lastname,
            @RequestParam(required = false) Date dateOfBirth,
            @RequestParam(required = false) String firstname,
            @RequestParam(required = false) String zip) {
//        if (lastname != null && dateOfBirth != null) {
//            return customerService.findByLastnameAndDateOfBirth(lastname, dateOfBirth);
//        } else if (lastname != null && firstname != null && zip != null) {
//            return customerService.findByLastnameAndFirstnameAndZip(lastname, firstname, zip);
//        }
        return List.of();
    }

    @PostMapping("/filter")
    public List<Customer> filterCustomer(@RequestBody @Valid Customer customer) {
        return customerService.findCustomersByExample(customer);
    }
}
