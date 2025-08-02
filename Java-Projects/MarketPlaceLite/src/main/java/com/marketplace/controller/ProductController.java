package com.marketplace.controller;

import com.marketplace.entity.Product;
import com.marketplace.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> list() {
        return service.listAll();
    }

    @PostMapping
    public Product add(@RequestBody Product p) {
        return service.save(p);
    }
}