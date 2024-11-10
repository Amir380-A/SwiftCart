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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public List<ProductVariationAttribute> getVariationAttributes() {
        return variationAttributes;
    }

    public void setVariationAttributes(List<ProductVariationAttribute> variationAttributes) {
        this.variationAttributes = variationAttributes;
    }
    @OneToMany(mappedBy = "productVariation", cascade = CascadeType.ALL)
    private List<ProductVariationAttribute> variationAttributes = new ArrayList<>();


}
