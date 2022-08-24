package com.example.demo2api.service;

import com.example.demo2api.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Vũ Thị Diễm Quỳnh", "hehe@gmail.com", "00000001", "123"));
        users.add(new User(2, "Vũ Thị Phương", "phuong@gmail.com", "0099777", "321"));
        users.add(new User(3, "Vũ Thị Hồng", "hong@gmail.com", "0099778", "312"));
        users.add(new User(2, "Vũ Thị Cam", "cam@gmail.com", "0099776", "231"));
    }

    @Override
    public List<User> getListUser() {
        return users;
    }
}
