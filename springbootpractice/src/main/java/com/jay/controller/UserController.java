package com.jay.controller;

import com.jay.model.User;
import com.jay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers(){

        // implementation

        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable(value="id") int id){

        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            return ResponseEntity.ok().body(user.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public User saveUser(@Validated @RequestBody User user){

        // implementation
        return userRepository.save(user);

    }





}
