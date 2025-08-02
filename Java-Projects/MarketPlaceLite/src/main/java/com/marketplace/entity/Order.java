package com.marketplace.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Product> products = new ArrayList<>();

    private Date orderDate = new Date();
}