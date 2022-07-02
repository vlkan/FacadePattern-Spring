package com.springexample.account.service;

import com.springexample.account.exception.CustomerNotFoundException;
import com.springexample.account.model.Customer;
import com.springexample.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer Not Found! " + id));
    }
}
