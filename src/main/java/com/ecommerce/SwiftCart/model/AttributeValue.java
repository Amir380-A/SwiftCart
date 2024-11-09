package com.ecommerce.SwiftCart.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class AttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    private String value;


}
