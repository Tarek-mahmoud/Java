package com.marketplace.controller;

import com.marketplace.dto.OrderRequest;
import com.marketplace.entity.Order;
import com.marketplace.service.OrderService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order order(@RequestBody OrderRequest req, Authentication auth) {
        return service.placeOrder(auth.getName(), req);
    }
}