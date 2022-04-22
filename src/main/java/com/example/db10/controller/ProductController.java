package com.example.db10.controller;

import com.example.db10.model.Product;
import com.example.db10.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/add-product-cart/{product_id}/{cart_id}")
    public Product addProductToCart(@PathVariable Integer productId, @PathVariable Integer cartId){
        return productService.addProductToCart(productId, cartId);
    }

    @PostMapping("/add-product-wishlist/{product_id}/{wishlist_id}")
    public Product addProductToWislist(@PathVariable Integer productId, @PathVariable Integer wishlistId){
        return productService.addProductToWishlist(productId, wishlistId);
    }

    @DeleteMapping("/delete-product-cart/{product_id}/{cart_id}")
    public String removeProductFromCart(@PathVariable Integer productId, @PathVariable Integer cartId){
        productService.removeProductFromCart(productId, cartId);
        return "The product was removed from the cart.";
    }

    @DeleteMapping("/delete-product-wishlist/{product_id}/{cart_id}")
    public String removeProductFromWishlist(@PathVariable Integer productId, @PathVariable Integer wishlistId){
        productService.removeProductFromWishlist(productId, wishlistId);
        return "The product was removed from the wishlist.";
    }
}

