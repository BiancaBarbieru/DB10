package com.example.db10.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;

    @OneToOne
    private User user;

    @OneToMany
    private List<Product> products;
}
