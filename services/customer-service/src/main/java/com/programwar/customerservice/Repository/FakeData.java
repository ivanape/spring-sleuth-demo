package com.programwar.customerservice.Repository;

import com.github.javafaker.Faker;
import com.programwar.customerservice.model.Customer;
import lombok.Getter;
import java.util.ArrayList;

@Getter
public class FakeData {

    private FakeData() {

    }

    public ArrayList<Customer> getCustomerList() {
        ArrayList<Customer> result = new ArrayList<>();

        for (int i = 1; i < 150; i++) {
            result.add(generateCustomerData(i));
        }

        return result;
    }

    private Customer generateCustomerData(int i) {
        Faker faker = new Faker();
        Customer result = new Customer();

        result.setId(i);
        result.setFullName(faker.name().fullName());
        result.setAddress(faker.address().fullAddress());

        return result;
    }

    public static FakeData instance = new FakeData();
}
