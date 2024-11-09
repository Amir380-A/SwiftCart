package com.ecommerce.SwiftCart.repository;

import com.ecommerce.SwiftCart.model.ProductVariationAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductVariationAttributeRepository extends JpaRepository<ProductVariationAttribute, Long> {

}
