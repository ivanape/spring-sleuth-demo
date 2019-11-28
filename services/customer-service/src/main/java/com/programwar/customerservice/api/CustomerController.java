package com.programwar.customerservice.api;

import com.programwar.customerservice.Repository.FakeCustomerRepository;
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

    @RequestMapping("/customer")
    @GetMapping(produces = "application/json")
    public @ResponseBody ArrayList<Customer> getCustomerList() {
        return this.customerRepository.getCustomerList();
    }

    @RequestMapping("/customer/{id}")
    @GetMapping(produces = "application/json")
    public @ResponseBody Customer getCustomerById(@PathVariable int id) {
        return this.customerRepository.getCustomerById(id);
    }

}
