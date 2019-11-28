package com.programwar.customerservice.Repository;

import com.programwar.customerservice.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeCustomerRepository {

    public ArrayList<Customer> getCustomerList() {
        return FakeData.instance.getCustomerList();
    }

}
