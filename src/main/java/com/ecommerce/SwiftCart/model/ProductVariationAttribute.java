package com.ecommerce.SwiftCart.model;
import jakarta.persistence.*;
import java.util.List;
// ProductVariationAttribute.java
@Entity
public class ProductVariationAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_variation_id")
    private ProductVariation productVariation;

    @ManyToOne
    @JoinColumn(name = "attribute_value_id")
    private AttributeValue attributeValue;


}
