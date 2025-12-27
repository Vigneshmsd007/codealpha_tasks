package com.example.e_commerce.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.e_commerce.website.model.Order;
import com.example.e_commerce.website.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderRepo.save(order);
    }
    
}
