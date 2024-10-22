package com.ecommerce.SwiftCart.controller;

import com.ecommerce.SwiftCart.model.User;
import com.ecommerce.SwiftCart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

}