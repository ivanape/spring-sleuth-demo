package com.programwar.productservice.api;

import com.programwar.productservice.model.Product;
import com.programwar.productservice.repository.FakeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class ProductController {

    final private FakeProductRepository productRepository;

    @Autowired
    public ProductController(FakeProductRepository productRepo) {
        this.productRepository = productRepo;
    }

    @RequestMapping("/products")
    @GetMapping(produces = "application/json")
    public ArrayList<Product> getProductList() {
        return this.productRepository.getProductList();
    }

}
