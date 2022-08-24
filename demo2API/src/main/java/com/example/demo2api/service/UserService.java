package com.example.demo2api.service;

import com.example.demo2api.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();
}
