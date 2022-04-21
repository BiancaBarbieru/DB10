package com.example.db10.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;

    @NotNull
    private String name;
    private Integer quantity;
    @NotNull
    private Double price;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Wishlist wishlist;
}
