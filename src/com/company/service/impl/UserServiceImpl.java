package com.company.service.impl;

import com.company.MyEXception;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDao();

    @Override
    public void koshuu(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);
    }

    @Override
    public void idMenenAluu(int id) {
        try {
            User user = userDao.getUsers()
                    .stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("ID jok"));
            System.out.println(user);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void idMenenOchuruu(int id) {
        try {
            User user = userDao.getUsers()
                    .stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new MyEXception("Id aluu"));
            userDao.getUsers().remove(user);
        } catch (MyEXception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void userlerdialuu() {
        userDao.getUsers()
                .forEach(System.out::println);
    }
}
