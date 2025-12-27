package com.example.e_commerce.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.e_commerce.website.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
