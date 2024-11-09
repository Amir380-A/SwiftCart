package com.ecommerce.SwiftCart.model;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

// ProductVariation.java
@Entity
public class ProductVariation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String sku;  // Stock Keeping Unit
    private double price;
    private int stockQuantity;

    @OneToMany(mappedBy = "productVariation", cascade = CascadeType.ALL)
    private List<ProductVariationAttribute> variationAttributes = new ArrayList<>();


}
