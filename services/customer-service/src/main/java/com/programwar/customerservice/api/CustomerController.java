package com.programwar.customerservice.api;

import com.programwar.customerservice.Repository.FakeCustomerRepository;
import com.programwar.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomerController {

    final private FakeCustomerRepository customerRepository;

    @Autowired
    public CustomerController(FakeCustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping("/customers")
    @GetMapping(produces = "application/json")
    public ArrayList<Customer> getProductList() {
        return this.customerRepository.getCustomerList();
    }

}
