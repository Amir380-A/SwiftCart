package com.ecommerce.SwiftCart.controller;
import com.ecommerce.SwiftCart.model.AttributeValue;
import com.ecommerce.SwiftCart.repository.AttributeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/attribute-values")
public class AttributeValueController {

    @Autowired
    private AttributeValueRepository attributeValueRepository;

    @GetMapping
    public List<AttributeValue> getAllAttributeValues() {
        return attributeValueRepository.findAll();
    }

    @GetMapping("/{id}")
    public AttributeValue getAttributeValueById(@PathVariable Long id) {
        return attributeValueRepository.findById(id).orElse(null);
    }

    @PostMapping
    public AttributeValue createAttributeValue(@RequestBody AttributeValue attributeValue) {
        return attributeValueRepository.save(attributeValue);
    }

    @PutMapping("/{id}")
    public AttributeValue updateAttributeValue(@PathVariable Long id, @RequestBody AttributeValue updatedAttributeValue) {
        return attributeValueRepository.findById(id)
                .map(attributeValue -> {
                    attributeValue.setValue(updatedAttributeValue.getValue());
                    attributeValue.setAttribute(updatedAttributeValue.getAttribute());
                    return attributeValueRepository.save(attributeValue);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAttributeValue(@PathVariable Long id) {
        attributeValueRepository.deleteById(id);
    }
}
