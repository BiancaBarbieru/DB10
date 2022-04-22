package com.example.db10.service;

import com.example.db10.model.Wishlist;
import com.example.db10.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist getWishlistById(Integer id){
        return wishlistRepository.getById(id);
    }

    public void addWishlist(Wishlist wishlist) {
        wishlistRepository.save(wishlist);
    }

    public void deleteWishlist(Wishlist wishlist){
        wishlistRepository.delete(wishlist);
    }

    public void updateWishlist(Wishlist wishlist){
        wishlistRepository.save(wishlist);
    }



}
