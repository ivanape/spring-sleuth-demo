package com.programwar.customerservice.Repository;

import com.github.javafaker.Faker;
import com.programwar.customerservice.model.Customer;
import lombok.Getter;
import java.util.ArrayList;

@Getter
public class FakeData {

    private static FakeData instance;
    private ArrayList<Customer> customerList;

    private FakeData() {

    }

    public ArrayList<Customer> getCusomerList() {
        return customerList;
    }

    private void setCustomerList() {
        customerList = new ArrayList<>();

        for (int i = 1; i < 150; i++) {
            customerList.add(generateCustomerData(i));
        }

    }

    private Customer generateCustomerData(int i) {
        Faker faker = new Faker();
        Customer result = new Customer();

        result.setId(i);
        result.setFullName(faker.name().fullName());
        result.setAddress(faker.address().fullAddress());

        return result;
    }


    public static FakeData getInstance() {
        if (instance == null) {
            instance = new FakeData();
            instance.setCustomerList();
        }

        return instance;
    }
}
