package com.programwar.productservice.repository;

import com.github.javafaker.Faker;
import com.programwar.productservice.model.Product;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FakeData {

    private FakeData() {

    }

    public ArrayList<Product> getProductLists() {
        ArrayList<Product> result = new ArrayList<>();

        for (int i = 1; i < 150; i++) {
            result.add(generateProductData(i));
        }

        return result;
    }

    private Product generateProductData(int i) {
        Faker faker = new Faker();
        Product result = new Product();

        result.setId(i);
        result.setName(faker.book().title());
        result.setPrice(faker.number().randomDouble(2, 20, 50));

        return result;
    }

    public static FakeData instance = new FakeData();
}
