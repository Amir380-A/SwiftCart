// package com.ecommerce.SwiftCart.controller;
// import com.ecommerce.SwiftCart.model.ProductVariationAttribute;
// import com.ecommerce.SwiftCart.repository.ProductVariationAttributeRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/v1/product-variation-attributes")
// public class ProductVariationAttributeController {

//     @Autowired
//     private ProductVariationAttributeRepository productVariationAttributeRepository;

//     @GetMapping
//     public List<ProductVariationAttribute> getAllProductVariationAttributes() {
//         return productVariationAttributeRepository.findAll();
//     }

//     @GetMapping("/{id}")
//     public ProductVariationAttribute getProductVariationAttributeById(@PathVariable Long id) {
//         return productVariationAttributeRepository.findById(id).orElse(null);
//     }

//     @PostMapping
//     public ProductVariationAttribute createProductVariationAttribute(@RequestBody ProductVariationAttribute productVariationAttribute) {
//         return productVariationAttributeRepository.save(productVariationAttribute);
//     }

//     @PutMapping("/{id}")
//     public ProductVariationAttribute updateProductVariationAttribute(@PathVariable Long id, @RequestBody ProductVariationAttribute updatedProductVariationAttribute) {
//         return productVariationAttributeRepository.findById(id)
//                 .map(productVariationAttribute -> {
//                     productVariationAttribute.setProductVariation(updatedProductVariationAttribute.getProductVariation());
//                     productVariationAttribute.setAttributeValue(updatedProductVariationAttribute.getAttributeValue());
//                     return productVariationAttributeRepository.save(productVariationAttribute);
//                 })
//                 .orElse(null);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteProductVariationAttribute(@PathVariable Long id) {
//         productVariationAttributeRepository.deleteById(id);
//     }
// }
