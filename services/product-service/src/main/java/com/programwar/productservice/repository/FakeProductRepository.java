package com.programwar.productservice.repository;

import com.programwar.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeProductRepository {

    public ArrayList<Product> getProductList() {
        return FakeData.instance.getProductLists();
    }

}
