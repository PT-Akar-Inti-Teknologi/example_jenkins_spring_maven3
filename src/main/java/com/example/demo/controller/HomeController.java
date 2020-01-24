package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    //@Autowired
    //private UserRepository userRepository;

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

    /*@GetMapping("/post-user")
    public String getUser() {

        userRepository.save(new User(0l, "Fulano"));

        return "OK";

    }*/

}
