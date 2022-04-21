package com.example.db10.service;

import com.example.db10.model.Product;
import com.example.db10.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private WishlistRepository wishlistRepository;

    public Product getProductById(Integer id){
        return productRepository.getById(id);
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(products::add);
        return products;
    }

    public Product addProductToCart(Integer productId, Integer cartId){
        cartRepository.getById(cartId).getProducts().add(getProductById(productId));
        return productRepository.save(getProductById(productId));
    }

    public Product addProductToWishlist(Integer productId, Integer wishlistId){
        wishlistRepository.getById(wishlistId).getProducts().add(getProductById(productId));
        return productRepository.save(getProductById(productId));
    }

    public void removeProductFromCart(Integer productId, Integer cartId){
        cartRepository.getById(cartId).getProducts().remove(getProductById(productId));
        productRepository.delete(getProductById(productId));
    }

    public void removeProductFromWishlist(Integer productId, Integer wishlistId){
        wishlistRepository.getById(wishlistId).getProducts().remove(getProductById(productId));
        productRepository.delete(getProductById(productId));
    }
}
