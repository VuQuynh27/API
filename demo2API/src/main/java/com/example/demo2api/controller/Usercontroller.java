package com.example.demo2api.controller;

import com.example.demo2api.entity.User;
import com.example.demo2api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class Usercontroller {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<User> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        return null;
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }
}
