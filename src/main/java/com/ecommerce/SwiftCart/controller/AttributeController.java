package com.ecommerce.SwiftCart.controller;
import com.ecommerce.SwiftCart.model.Attribute;
import com.ecommerce.SwiftCart.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/attributes")
public class AttributeController {

    @Autowired
    private AttributeRepository attributeRepository;

    @GetMapping
    public List<Attribute> getAllAttributes() {
        return attributeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Attribute getAttributeById(@PathVariable Long id) {
        return attributeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Attribute createAttribute(@RequestBody Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @PutMapping("/{id}")
    public Attribute updateAttribute(@PathVariable Long id, @RequestBody Attribute updatedAttribute) {
        return attributeRepository.findById(id)
                .map(attribute -> {
                    // Update the necessary fields here, if applicable
                    return attributeRepository.save(attribute);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAttribute(@PathVariable Long id) {
        attributeRepository.deleteById(id);
    }
}
