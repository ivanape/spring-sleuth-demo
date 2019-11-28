package com.programwar.productservice.repository;

import com.github.javafaker.Faker;
import com.programwar.productservice.model.Product;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FakeData {

    private static FakeData instance;
    private ArrayList<Product> productList;

    private FakeData() {

    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList() {
        productList = new ArrayList<>();

        for (int i = 1; i < 150; i++) {
            productList.add(generateProductData(i));
        }

    }

    private Product generateProductData(int i) {
        Faker faker = new Faker();
        Product result = new Product();

        result.setId(i);
        result.setName(faker.book().title());
        result.setPrice(faker.number().randomDouble(2, 20, 50));

        return result;
    }

    public static FakeData getInstance() {
        if (instance == null) {
            instance = new FakeData();
            instance.setProductList();
        }

        return instance;
    }
}
