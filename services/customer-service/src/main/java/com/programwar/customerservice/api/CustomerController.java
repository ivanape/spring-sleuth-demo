package com.programwar.customerservice.api;

import com.programwar.customerservice.repository.FakeCustomerRepository;
import com.programwar.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CustomerController {

    final private FakeCustomerRepository customerRepository;

    @Autowired
    public CustomerController(FakeCustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(path = "/customer", produces = "application/json")
    public ArrayList<Customer> getCustomerList() {
        return this.customerRepository.getCustomerList();
    }

    @GetMapping(path="/customer/{id}", produces = "application/json")
    public Customer getCustomerById(@PathVariable int id) {
        return this.customerRepository.getCustomerById(id);
    }

}
