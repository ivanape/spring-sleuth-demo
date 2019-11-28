package com.programwar.productservice.api;

import com.programwar.productservice.model.Product;
import com.programwar.productservice.repository.FakeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ProductController {

    final private FakeProductRepository productRepository;

    @Autowired
    public ProductController(FakeProductRepository productRepo) {
        this.productRepository = productRepo;
    }

    @GetMapping(path = "/product", produces = "application/json")
    public ArrayList<Product> getProductList() {
        return this.productRepository.getProductList();
    }

    @GetMapping(path = "/product/{id}", produces = "application/json")
    public Product getProductById(@PathVariable int id) {
        return this.productRepository.getCustomerById(id);
    }

}
