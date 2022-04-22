package com.example.db10.controller;

import com.example.db10.model.Cart;
import com.example.db10.model.Wishlist;
import com.example.db10.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class WishlistController {
    @Autowired
    WishlistService wishlistService;

    @GetMapping("/wishlist/{id}")
    public Wishlist getWishlistById(@PathVariable Integer id){
        return wishlistService.getWishlistById(id);
    }

    @PostMapping("/wishlists")
    public Wishlist addWishlist(@RequestBody Wishlist wishlist){
        wishlistService.addWishlist(wishlist);
        return wishlist;
    }
    @PostMapping("/wishlists/update")
    public Wishlist wishlistUpdate(@RequestBody Wishlist wishlist){
        wishlistService.updateWishlist(wishlist);
        return wishlist;
    }
}
