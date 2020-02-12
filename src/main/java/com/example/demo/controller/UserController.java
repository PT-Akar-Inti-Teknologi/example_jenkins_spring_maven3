package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index() {
        return "Hello World";
    }

    @GetMapping("/user")
    public User getUser() {
        return new User(14l, "John");
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return user;
    }

    @GetMapping("/usera")
    public User postUserNew() {
        User user = new User(1l, "Teste");
        userService.save(user);
        return user;
    }


}