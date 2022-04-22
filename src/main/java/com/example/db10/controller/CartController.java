package com.example.db10.controller;

import com.example.db10.model.Cart;
import com.example.db10.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/cart/{id}")
    public Cart  getCartById(@PathVariable Integer id){
        return cartService.getCartById(id);
    }

    @PostMapping("/carts")
    public Cart addCart(@RequestBody Cart cart){
        cartService.addCart(cart);
        return cart;
    }
    @PostMapping("/carts/update")
    public Cart cartUpdate(@RequestBody Cart cart){
        cartService.updateCart(cart);
        return cart;
    }
}
