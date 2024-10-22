package com.ecommerce.SwiftCart.repository;

import com.ecommerce.SwiftCart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}