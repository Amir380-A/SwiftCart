package com.ecommerce.SwiftCart.controller;
import com.ecommerce.SwiftCart.model.ProductVariation;
import com.ecommerce.SwiftCart.repository.ProductVariationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product-variations")
public class ProductVariationController {

    @Autowired
    private ProductVariationRepository productVariationRepository;

    @GetMapping
    public List<ProductVariation> getAllProductVariations() {
        return productVariationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProductVariation getProductVariationById(@PathVariable Long id) {
        return productVariationRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ProductVariation createProductVariation(@RequestBody ProductVariation productVariation) {
        return productVariationRepository.save(productVariation);
    }

    @PutMapping("/{id}")
    public ProductVariation updateProductVariation(@PathVariable Long id, @RequestBody ProductVariation updatedProductVariation) {
        return productVariationRepository.findById(id)
                .map(productVariation -> {
                    productVariation.setSku(updatedProductVariation.getSku());
                    productVariation.setPrice(updatedProductVariation.getPrice());
                    productVariation.setStockQuantity(updatedProductVariation.getStockQuantity());
                    return productVariationRepository.save(productVariation);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProductVariation(@PathVariable Long id) {
        productVariationRepository.deleteById(id);
    }
}
