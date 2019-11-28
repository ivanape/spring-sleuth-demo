package com.programwar.orderservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private int id;
    private String name;
    private double price;

    public Product() {

    };

    public Product(int id, String name, double price){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

}
