package com.minimart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minimart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
