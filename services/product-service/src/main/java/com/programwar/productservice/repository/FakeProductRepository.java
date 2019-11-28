package com.programwar.productservice.repository;

import com.programwar.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeProductRepository {

    public ArrayList<Product> getProductList() {
        return FakeData.getInstance().getProductList();
    }

    public Product getCustomerById(int id) {

        return FakeData.getInstance().getProductList().stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
