package com.ecommerce.SwiftCart.repository;

import com.ecommerce.SwiftCart.model.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

}
