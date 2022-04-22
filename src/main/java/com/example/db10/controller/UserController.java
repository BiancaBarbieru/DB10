package com.example.db10.controller;

import com.example.db10.model.User;
import com.example.db10.model.Wishlist;
import com.example.db10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        userService.addUser(user);
        return user;
    }
    @PostMapping("/users/update")
    public User userUpdate(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }
}
