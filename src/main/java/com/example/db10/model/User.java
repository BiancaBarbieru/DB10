package com.example.db10.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;

    @NotNull
    private String name;

    @OneToOne
    private Cart cart;

    @OneToOne
    private Wishlist wishlist;

}
