package com.example.e_commerce.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.e_commerce.website.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
