package com.ecommerce.SwiftCart.model;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


  //  private String description;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
