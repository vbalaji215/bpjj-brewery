package com.bpjj.brewery.services;

import com.bpjj.brewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * vbala created on 3/18/2020
 * Inside the package - com.bpjj.brewery.services
 **/
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
    CustomerDto createCustomer(CustomerDto customerDto);
    void updateCustomer(UUID customerId, CustomerDto customerDto);
    void deleteCustomer(UUID customerId);
}
