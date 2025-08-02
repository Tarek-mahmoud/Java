package com.marketplace.service;

import com.marketplace.entity.Product;
import com.marketplace.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> listAll() {
        return repo.findAll();
    }

    public Product save(Product p) {
        return repo.save(p);
    }

    public Optional<Product> get(Long id) {
        return repo.findById(id);
    }
}