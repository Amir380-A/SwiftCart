package com.ecommerce.SwiftCart.repository;

import com.ecommerce.SwiftCart.model.AttributeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeValueRepository extends JpaRepository<AttributeValue, Long> {

}
