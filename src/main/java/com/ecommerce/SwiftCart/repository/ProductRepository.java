package com.ecommerce.SwiftCart.repository;
import com.ecommerce.SwiftCart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}