package com.programwar.orderservice.api;

import com.programwar.orderservice.model.Order;
import com.programwar.orderservice.repository.FakeOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Optional;

@RestController
public class OrderController {

    final private FakeOrderRepository orderRepository;

    @Autowired
    public OrderController(FakeOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping(path="/createorder/{number}", produces = "application/json")
    public ArrayList<Order> createOrder(@PathVariable Optional<Integer> number, HttpServletResponse response) {

        if (!number.isPresent()) {
            number = Optional.of(1);
        }

        response.setStatus(HttpServletResponse.SC_ACCEPTED);

        return this.orderRepository.createOrderSecuence(number.get());
    }
}
