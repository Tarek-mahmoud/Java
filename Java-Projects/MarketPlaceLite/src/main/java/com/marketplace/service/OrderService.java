package com.marketplace.service;

import com.marketplace.dto.OrderRequest;
import com.marketplace.entity.*;
import com.marketplace.repository.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class OrderService {
    private final OrderRepository orderRepo;
    private final ProductRepository productRepo;
    private final UserRepository userRepo;

    public OrderService(OrderRepository orderRepo, ProductRepository productRepo, UserRepository userRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
        this.userRepo = userRepo;
    }

    public Order placeOrder(String username, OrderRequest request) {
        User user = userRepo.findByUsername(username).orElseThrow();
        List<Product> products = productRepo.findAllById(request.getProductIds());
        Order order = new Order(null, user, products, new Date());
        return orderRepo.save(order);
    }
}