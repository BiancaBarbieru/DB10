package com.example.db10.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;

    @OneToMany
    private List<Product> products;

    @OneToOne
    private User user;
}
