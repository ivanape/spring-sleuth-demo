package com.programwar.orderservice.repository;

import com.programwar.orderservice.common.RestTemplateHelper;
import com.programwar.orderservice.model.Customer;
import com.programwar.orderservice.model.Order;
import com.programwar.orderservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class FakeOrderRepository {

    private final String productServiceURL = "http://localhost:8082/product";
    private final String customerServiceURL = "http://localhost:8081/customer";

    private List<Product> productList;
    private List<Customer> customersList;
    private RestTemplateHelper restTemplateHelper;

    @Autowired
    public FakeOrderRepository(RestTemplateHelper restTemplateHelper) {
        this.restTemplateHelper = restTemplateHelper;
    }

    public ArrayList<Order> createOrderSecuence(int orderNumber) {

        productList = this.restTemplateHelper.getForList(Product.class, productServiceURL);
        customersList = this.restTemplateHelper.getForList(Customer.class, customerServiceURL);

        ArrayList<Order> orderList = new ArrayList<>();

        for (int i = 0; i < orderNumber; i++) {
            orderList.add(this.createNewOrder());
        }

        return orderList;
    }

    private Order createNewOrder() {

        Random rand = new Random();


        return null;
    }
}
