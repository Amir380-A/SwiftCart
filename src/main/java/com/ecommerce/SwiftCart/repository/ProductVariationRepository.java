package com.ecommerce.SwiftCart.repository;

import com.ecommerce.SwiftCart.model.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariation, Long> {

}

