package com.programwar.customerservice.Repository;

import com.programwar.customerservice.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeCustomerRepository {

    public ArrayList<Customer> getCustomerList() {
        return FakeData.getInstance().getCustomerList();
    }

    public Customer getCustomerById(int id) {

        return FakeData.getInstance().getCustomerList().stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
