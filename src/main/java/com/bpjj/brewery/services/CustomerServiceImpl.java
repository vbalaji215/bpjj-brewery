package com.bpjj.brewery.services;

import com.bpjj.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * vbala created on 3/18/2020
 * Inside the package - com.bpjj.brewery.services
 **/
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Balaji").build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return customerDto;
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Update the customer");

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Delete the customer");
    }
}
