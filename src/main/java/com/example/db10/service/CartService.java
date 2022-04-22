package com.example.db10.service;

import com.example.db10.model.Cart;
import com.example.db10.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart getCartById(Integer id){
        return cartRepository.getById(id);
    }

    public void addCart(Cart cart){
    cartRepository.save(cart);
    }

    public void deleteCart(Cart cart){
        cartRepository.delete(cart);
    }

    public void updateCart(Cart cart){
        cartRepository.save(cart);
    }
}
